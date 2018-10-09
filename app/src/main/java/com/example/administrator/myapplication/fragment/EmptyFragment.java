package com.example.administrator.myapplication.fragment;


import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.ShopContentActivity;
import com.example.administrator.myapplication.adapter.EmptyListAdapter;
import com.example.administrator.myapplication.base.App;
import com.example.administrator.myapplication.base.BaseFragment;
import com.example.administrator.myapplication.base.Urls;
import com.example.administrator.myapplication.model.api.OpenDoorApi;
import com.example.administrator.myapplication.model.api.QRcodeApi;
import com.example.administrator.myapplication.model.entity.MachineProduct;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.administrator.myapplication.base.App.context;


@SuppressLint("ValidFragment")
public class EmptyFragment extends BaseFragment {

    private GridView gridView;
    private EmptyListAdapter emptyListAdapter;
    private List<MachineProduct> list = new ArrayList<>();
    private int machineId;
    private int id;
    private Bundle bundle;
    private String imachineIdStr;

    @SuppressLint("ValidFragment")
    public EmptyFragment (List<MachineProduct> list){
        this.list = list;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.shop_content_fragment;
    }

    @Override
    protected void initView(View view) {
        gridView = view.findViewById(R.id.contentGridView);
    }

    @Override
    protected void initData() {
        emptyListAdapter = new EmptyListAdapter(getActivity(),list,R.layout.shop_content);
        gridView.setAdapter(emptyListAdapter);
        emptyListAdapter.notifyDataSetChanged();
    }

    @Override
    protected void loadData() {
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int machineSkuPriceCurrent = list.get(i).getMachineSkuPriceCurrent();
                int machineSkuPriceOriginal = list.get(i).getMachineSkuPriceOriginal();
                id = list.get(i).getId();
                machineId = list.get(i).getMachineId();
                String productName1 = list.get(i).getProductName1();
                String productName2 = list.get(i).getProductName2();
                String image = list.get(i).getImage();
                bundle = new Bundle();
                bundle.putInt("code",id);
                bundle.putInt("machineId",machineId);
                bundle.putString("image",image);
                bundle.putString("shopName1",productName1);
                bundle.putString("shopName2",productName2);
                bundle.putInt("priceCurrent",machineSkuPriceCurrent);
                bundle.putInt("priceOriginal",machineSkuPriceOriginal);
                Log.d("xuezhiyuan",id+"");
                try{
                    NetGetRequest(id,machineId);
                }catch (Exception e){
                    e.getMessage();
                }

            }
        });
    }



    //跳转Activity
    public void in(Class tClass,Bundle bundle) {
        Intent intent = new Intent(context, tClass);
        intent.putExtra("Message",bundle);
        startActivity(intent);
        context.overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }


    @Override
    public void onClick(View view) {

    }

    //请求orderId数据
    private void NetGetRequest(int code, final int machineId){
        //正在加载数据  显示弹出框
        showProgressBar();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Urls.BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        QRcodeApi qRcodeApi = retrofit.create(QRcodeApi.class);
        Call<JsonObject> call = qRcodeApi.getData(code,machineId);
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if(response.isSuccessful()){
                    //加载成功数据  消失弹出框
                    dismiss();
                    JsonObject data = response.body().getAsJsonObject("data");
                    JsonElement jsonElement = data.get("code");
                    JsonElement imachineId = data.get("imachineId");
                    imachineIdStr = imachineId.toString();
                    String code = jsonElement.toString();
                    Log.d("xuezhiyuancode",code+"==="+imachineIdStr);
                    if("200".equals(code)){
                        //加载成功  且   货仓   和  门锁  正常
                        JsonElement orderId = data.get("orderId");
                        JsonElement qcode = data.get("qcode");
                        bundle.putString("orderId", orderId.toString());
                        bundle.putString("qcode", qcode.toString());
                        in(ShopContentActivity.class, bundle);
                    }else if("500".equals(code)){
                        //提示框
                        dialogAlentOpenDoor("温馨提示","货仓中有商品，请取走后购买");
                    }else {
                        //网络连接异常  404  消息队列over
                        dialogAlent("温馨提示","请检测服务");
                    }
                }else{
                    Log.d("xuezhiyuan","请求数据失败1");
                }
            }
            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                //网络连接失败  提示框
                if(!(context).isFinishing()) {
                    dialogAlent("温馨提示","网络请求失败");
                }
                Log.d("xuezhiyuan","请求数据失败2");
            }
        });
    }



    //请求打开门数据
    private void NetGetRequestOpenDoor(int machineId,int imachineId){
        //正在加载数据   显示弹出框
        showProgressBar();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Urls.BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        OpenDoorApi openDoorApi = retrofit.create(OpenDoorApi.class);
        Call<JsonObject> call = openDoorApi.getData(machineId,imachineId);
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if(response.isSuccessful()){
                    //数据加载成功   消失弹出框
                    dismiss();
                    /*Log.d("doorResult",response.body().toString());
                    JsonObject data = response.body().getAsJsonObject("data");
                    JsonElement jsonElement = data.get("isGoodStateOK");
                    boolean code = jsonElement.getAsBoolean();
                    if(code == true){
                        //门锁已打开   货物已取走
                        dismiss();
                    }else {
                        //门锁已打开   货物未取走
                        dismiss();
                    }*/
                    Log.d("xuezhiyuan","请求开门成功");
                }else{
                    Log.d("xuezhiyuan","请求数据失败1");
                }
            }
            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                //网络连接失败  提示框
                dialogAlent("温馨提示","网络请求失败");
                Log.d("xuezhiyuan","请求数据失败2");
            }
        });
    }


    //货仓有货    开门弹出框
    private void dialogAlentOpenDoor(String title,String content){
        new AlertDialog.Builder(App.context)
                .setTitle(title)
                .setMessage(content)
                .setCancelable(false)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        NetGetRequestOpenDoor(machineId,Integer.parseInt(imachineIdStr));
                        dialog.dismiss();
                    }
                })
                .create().show();
    }

    //网络连接失败   弹出框
    private void dialogAlent(String title,String content){
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(content)
                .setCancelable(false)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create().show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


}
