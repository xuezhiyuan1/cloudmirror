package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.base.BaseActivity;
import com.example.administrator.myapplication.base.Urls;
import com.example.administrator.myapplication.model.api.BigImgApi;
import com.example.administrator.myapplication.model.api.PayStateApi;
import com.example.administrator.myapplication.model.util.ZxingUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Timer;
import java.util.TimerTask;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.administrator.myapplication.base.App.context;

/**
 * 作者：zhiyuan Xue on 2018/9/3 17:24
 * 邮箱：xzy7319@sina.com
 */

public class ShopContentActivity extends BaseActivity implements View.OnClickListener{

    private ImageView imageView;
    private Timer timer = new Timer();
    private int time = 120;
    //倒计时
    private TextView textViewValue;
    //返回键
    private LinearLayout linBack;
    //大图
    private ImageView imageViewInfo;
    //商品名
    private TextView textViewShopName,textViewShopNameLitter,originalPrice,currentPrice1,currentPrice2;

    private String shopName1;
    private String shopName2;
    private int priceCurrent;
    private int priceOriginal;
    private Bitmap bitmap;
    private String orderId;
    private String qcode;
    //查询订单状态接口

    private int code;
    private int machineId;
    //订单状态
    private String state = "1";

    //大图地址
    private String imgView;
    private String str2;
    private String str;


    @Override
    protected void layoutId() {
        setContentView(R.layout.activity_shop_content);
        timer.schedule(task, time, 1000);
    }

    @Override
    protected void initView() {
        //  接收 数据
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("Message");
        shopName1 = bundle.getString("shopName1");
        shopName2 = bundle.getString("shopName2");
        priceCurrent = bundle.getInt("priceCurrent");
        priceOriginal = bundle.getInt("priceOriginal");
        orderId = bundle.getString("orderId");
        qcode = bundle.getString("qcode");
        code = bundle.getInt("code");
        machineId = bundle.getInt("machineId");

        imageViewInfo = (ImageView) findViewById(R.id.image_info);
        textViewShopName = (TextView) findViewById(R.id.shop_content_info);
        linBack = (LinearLayout) findViewById(R.id.back_Text);
        textViewValue = (TextView) findViewById(R.id.value_Text);
        imageView = (ImageView) findViewById(R.id.image_recode);
        textViewShopNameLitter = (TextView) findViewById(R.id.shop_Name2);
        originalPrice = (TextView) findViewById(R.id.original_price);
        currentPrice1 = (TextView) findViewById(R.id.current_price1);
        currentPrice2 = (TextView) findViewById(R.id.current_price2);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
         linBack.setOnClickListener(this);
    }

    @Override
    protected void loadData() {

        textViewShopName.setText(shopName1);
        textViewShopNameLitter.setText(shopName2);
        originalPrice.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        double original = Double.parseDouble(priceOriginal+"");
        double originals = original / 100;
        NumberFormat nf = new DecimalFormat("##.##");
        str = nf.format(originals);

        double current = Double.parseDouble(priceCurrent+"");
        double currents = current / 100;
        str2 = nf.format(currents);
        originalPrice.setText("市场价：￥"+ str);
        currentPrice1.setText("折扣价：￥"+ str2);
        currentPrice2.setText("需支付：￥"+ str2);
        String wXbase= qcode.replace("\"", "");
        bitmap = ZxingUtils.createBitmap("https://"+wXbase+"/getOrderList?orderid="+orderId);
        imageView.setImageBitmap(bitmap);
        NetGetRequest(code,machineId);
        Log.d("zhangsan","https://"+wXbase+"/getOrderList?orderid="+orderId);

    }

    @Override
    public void in(Class tClass) {

    }

    TimerTask task = new TimerTask() {
        @Override public void run() {
            runOnUiThread(new Runnable() {
                private String stateStr;
                private int stateInt;
                @Override public void run() {
                    time--;
                    textViewValue.setText(String.valueOf(time)+"s");
                    textViewValue.setEnabled(false);
                    if(time > 0){
                        stateStr = NetGetRequest(Integer.parseInt(orderId));
                        if("2".equals(stateStr)){
                            time = 0;
                            stopTimer();
                        }
                        stateInt = Integer.parseInt(stateStr);
                        if(stateInt == 2){
                            Bundle bundle = new Bundle();
                            bundle.putString("original",str);
                            bundle.putString("current",str2);
                            bundle.putString("imgUrl",imgView);
                            bundle.putString("shopName1",shopName1);
                            bundle.putString("shopName2",shopName2);
                            bundle.putString("orderId",orderId);
                            bundle.putInt("state",stateInt);
                            inAct(ShopFinishActivity.class,bundle);
                        }else {
                            stateStr = null;
                        }
                    }else {
                        stateStr = null;
                        out();
                    }
                }
            });
        }
    };

    public void out() {
        finish();
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }

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
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.back_Text:{
                stopTimer();
                out();
                /*Intent intent = new Intent(this,ShopActivity.class);
                startActivity(intent);
                finish();*/
            }
            break;
        }
    }

    //加载图片
    public int loadImage(ImageView imageView,String imgUrl){
        if(context !=null){
            Glide.with(context).load(imgUrl).into(imageView);
            return 1;
        }else{
            return 0;
        }
    }



    //请求数据  预支付
    private void NetGetRequest(int machineProductId,int machineId){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Urls.BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        BigImgApi bigImgApi = retrofit.create(BigImgApi.class);
        Call<JsonObject> call = bigImgApi.getData(machineProductId,machineId);
        call.enqueue(new Callback<JsonObject>() {


            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if(response.isSuccessful()){
                    JsonObject data = response.body().getAsJsonObject("data");
                    JsonElement jsonElement = data.get("machineProductImgList");
                    JsonArray asJsonArray = jsonElement.getAsJsonArray();
                    JsonObject asJsonObject = asJsonArray.get(0).getAsJsonObject();
                    JsonElement img = asJsonObject.get("imgId");
                    imgView = img.toString().replace("\"", "");
                    int i = loadImage(imageViewInfo, Urls.BASEIMAGEBEFORE + imgView + Urls.BASEIMAGEAFTER);
                    if(i == 0){
                        Log.d("xuezhiyuan","图片加载失败");
                    }else {
                        Log.d("xuezhiyuan","图片加载成功");
                    }
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






    //请求数据
    private String NetGetRequest(int orderId){
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
                    state = jsonElement.toString();
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
        return state;
    }

    //跳转Activity
    public void inAct(Class tClass,Bundle bundle) {
        Intent intent = new Intent(context, tClass);
        intent.putExtra("finish",bundle);
        startActivity(intent);
        finish();
        context.overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }

}
