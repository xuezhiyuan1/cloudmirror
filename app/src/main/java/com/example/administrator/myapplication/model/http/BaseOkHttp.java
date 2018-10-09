package com.example.administrator.myapplication.model.http;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.administrator.myapplication.base.App;
import com.example.administrator.myapplication.model.http.callback.ResultCallBack;
import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class BaseOkHttp<T> {

    //请求成功的状态码
    private static final int SUCCESSCODE = 200;
    //请求失败的状态码
    private static final int ERRORCODE = 100;

    /**
     * 抽取单例的OKHttpClient对象
     * 第一步 构造函数私有化
     * 第二步 提供一个共有的、静态的方法 该方法的返回值BaseOkHttp
     * 第三步 提供私有的静态的BaseOkHttp的对象
     */


    //保证OkHttpClient对象是单例的
    private OkHttpClient okHttpClient;

    private static BaseOkHttp baseOkHttp = null;
    private BaseOkHttp(){
        okHttpClient = new OkHttpClient.Builder().build();
    }

    public synchronized static BaseOkHttp getInstance(){
        if(baseOkHttp == null) {
            baseOkHttp = new BaseOkHttp();
        }
        return baseOkHttp;
    }


    /**
     * 发送get请求
     * @param url 请求地址
     * @param params 参数列表
     * @param callBack 请求的回调
     */
    public void get(String url, Map<String,String> params, final ResultCallBack<T> callBack){
        if(params != null && params.size() > 0) {
            StringBuffer sb = new StringBuffer(url);
            sb.append("?");
            Set<String> keys = params.keySet();

            for (String key : keys) {
                sb.append(key).append("=").append(params.get(key)).append("&");
            }

            url = sb.toString().substring(0, sb.length() - 1);
        }

        Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                App.context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (e != null && e.getMessage() != null)
                            callBack.onError(e.getMessage().toString(), "100");
                    }
                });
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {

                String result = response.body().string();
                final T t = getGeneric(result, callBack);
                App.context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callBack.onSuccess(t);
                    }
                });

            }
        });

    }

    /**
     * 发送POST请求
     * @param url 请求地址
     * @param params 参数列表
     * @param callBack 回调
     */
    public void post(String url, Map<String,String> params, final ResultCallBack<T> callBack){
        FormBody.Builder builder = null;
        if(params != null && params.size() > 0) {
            builder = new FormBody.Builder();

            Set<String> keys = params.keySet();

            for (String key : keys) {
                builder.add(key,params.get(key));
            }

        }

        Request request = new Request.Builder().url(url).post(builder.build()).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {

                App.context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (e != null && e.getMessage() != null)
                            callBack.onError(e.getMessage().toString(), "100");
                    }
                });

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();

                final T t = getGeneric(result, callBack);
                App.context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callBack.onSuccess(t);
                    }
                });

            }
        });

    }

    /**
     * 使用Glide加载网络图片
     * @param imageView
     * @param imgUrl
     */
    public void loadImage(ImageView imageView, String imgUrl){
        Glide.with(App.context).load(imgUrl).into(imageView);
    }

    private T getGeneric(String jsonData, ResultCallBack<T> callBack){
        Gson gson = new Gson();
        //通过反射获取泛型的实例
        Type[] types = callBack.getClass().getGenericInterfaces();
        Type[] actualTypeArguments = ((ParameterizedType) types[0]).getActualTypeArguments();
        T t = gson.fromJson(jsonData,actualTypeArguments[0]);
        return t;
    }

}
