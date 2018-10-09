package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.base.App;
import com.example.administrator.myapplication.base.BaseActivity;
import com.example.administrator.myapplication.base.Urls;
import com.example.administrator.myapplication.model.api.PayFinishState;
import com.example.administrator.myapplication.model.api.PayStateApi;
import com.example.administrator.myapplication.model.http.BaseOkHttp;
import com.example.administrator.myapplication.model.http.callback.ResultCallBack;
import com.example.administrator.myapplication.model.util.DeleteFileUtil;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Timer;
import java.util.TimerTask;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者：zhiyuan Xue on 2018/9/11 18:05
 * 邮箱：xzy7319@sina.com
 */

public class ShopFinishActivity extends BaseActivity {

    private TextView textViewName,textViewLitterName,textViewOriginal,textViewCurrent,textViewResult;
    private ImageView imageView_finish;
    private String imgUrl;
    private String orderId;
    private int time = 400;
    private Timer timer = new Timer();


    @Override
    protected void layoutId() {
         setContentView(R.layout.shop_finish_activity);
         timer.schedule(task, time, 1000);
    }

    @Override
    protected void initView() {

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("finish");
        String shopName1 = bundle.getString("shopName1");
        String shopName2 = bundle.getString("shopName2");
        String priceCurrent = bundle.getString("current");
        String priceOriginal = bundle.getString("original");
        orderId = bundle.getString("orderId");
        imgUrl = bundle.getString("imgUrl");

        imageView_finish = findViewById(R.id.image_info_finish);
        textViewName = findViewById(R.id.shop_content_info_finish);
        textViewLitterName = findViewById(R.id.shop_Name_finish);
        textViewOriginal= findViewById(R.id.original_price_finish);
        textViewCurrent = findViewById(R.id.current_price_finish);
        textViewResult = findViewById(R.id.textResult);

        textViewName.setText(shopName1);
        textViewLitterName.setText(shopName2);
        textViewOriginal.setText("市场价：￥"+priceOriginal);
        textViewCurrent.setText("已支付：￥"+priceCurrent);
    }

    @Override
    protected void initData() {
        Glide.with(App.context).load(Urls.BASEIMAGEBEFORE+ imgUrl +Urls.BASEIMAGEAFTER).into(imageView_finish);
    }

    @Override
    protected void initListener() {

    }


    TimerTask task = new TimerTask() {
        @Override public void run() {

            runOnUiThread(new Runnable() {

                @Override public void run() {
                    time --;
                    if(time > 0){
                        NetGetRequest(Integer.parseInt(orderId));
                    }else {
                        DeleteFileUtil.deletefile("obj.out");
                        //取货超时
                        textViewResult.setText("出货失败");
                        stopTimer();
                        in(MainActivity.class);
                    }
                }
            });
        }
    };



    private void stopTimer(){

        if (task != null) {
            task.cancel();
            task = null;
        }

        if (task != null) {
            task.cancel();
            task = null;
        }
    }

    @Override
    protected void loadData() {

    }

    @Override
    public void in(Class tClass) {
       Intent intent = new Intent(this,tClass);
       startActivity(intent);
       finish();
       overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }

    //请求数据
    private void NetGetRequest(final int orderId){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Urls.BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PayStateApi payStateApi = retrofit.create(PayStateApi.class);
        Call<JsonObject> call = payStateApi.getData(orderId);
        call.enqueue(new Callback<JsonObject>() {

            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if(response.isSuccessful()){
                    JsonObject data = response.body().getAsJsonObject("data");
                    JsonElement jsonElement = data.get("state");
                    String state = jsonElement.toString();
                    if("5".equals(state)){
                        textViewResult.setText("出货成功");
                        stopTimer();
                        DeleteFileUtil.deletefile("obj.out");
                        in(MainActivity.class);
                    }else if("2".equals(state)){
                        textViewResult.setText("正在出货中...");
                        Log.d("xuezhiyuan",state);
                    }else {
                        //出货失败
                        textViewResult.setText("出货失败");
                        stopTimer();
                        DeleteFileUtil.deletefile("obj.out");
                        in(MainActivity.class);
                    }
                    Log.d("xuezhiyuan", state);
                }else{
                    Log.d("xuezhiyuan","请求数据失败");
                }
            }
            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                    Log.d("xuezhiyuan","请求数据失败");
            }
        });
    }
}
