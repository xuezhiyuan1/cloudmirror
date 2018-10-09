package com.example.administrator.myapplication.activity;


import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.HomePagerAdapter;
import com.example.administrator.myapplication.base.BaseActivity;
import com.example.administrator.myapplication.base.BaseFragment;
import com.example.administrator.myapplication.base.Urls;
import com.example.administrator.myapplication.fragment.EmptyFragment;
import com.example.administrator.myapplication.model.entity.MachineProduct;
import com.example.administrator.myapplication.model.entity.ShopListBean;
import com.example.administrator.myapplication.model.util.ReadFileUtil;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



/**
 * Created by Administrator on 2018/8/28.
 */

public class ShopActivity extends BaseActivity implements View.OnClickListener{

    private TabLayout titleLayout;
    private List<ShopListBean.DataBean.ResultBean.MachineCategoryListBean> titles;
    private ViewPager mViewPager;
    private HomePagerAdapter pagerAdapter;
    private List<BaseFragment> fragments;
    private ImageView imageView;
    private int tagTab = 1;
    //shopcarBtn

    @Override
    public void onClick(View view) {
         switch (view.getId()){
             case R.id.tagImage:{
                 in(MainActivity.class);
             }
             break;
            /* case R.id.shop_car_Image:{
                 Toast.makeText(ShopActivity.this,"暂未开通",Toast.LENGTH_SHORT).show();
                 //in(ShoppingCarActivity.class);
             }
             break;*/
         }
    }

    @Override
    protected void layoutId() {
        setContentView(R.layout.activity_shop);
    }

    @Override
    protected void initView() {
        //shopcarBtn = findViewById(R.id.shop_car_Image);
        imageView = findViewById(R.id.tagImage);
        titleLayout = findViewById(R.id.homeTitleLayout);
        mViewPager = findViewById(R.id.homeViewPager);
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                 Log.d("page",position+"onPageScrolled");
            }

            @Override
            public void onPageSelected(int position) {
                Log.d("page",position+"onPageSelected");
                tagTab = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        titleLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        titleLayout.setTabMode(TabLayout.MODE_FIXED);
    }

    @Override
    protected void initData() {
        fragments = new ArrayList<>();
        titles = new ArrayList<>();
        pagerAdapter = new HomePagerAdapter(getSupportFragmentManager(),fragments,titles);
        mViewPager.setAdapter(pagerAdapter);
        titleLayout.setupWithViewPager(mViewPager);
    }

    @Override
    protected void initListener() {
        imageView.setOnClickListener(this);
        //shopcarBtn.setOnClickListener(this);
    }

    @Override
    protected void loadData() {
        //读取本地数据加载
        ReadFileUtil readFileUtil = new ReadFileUtil();
        String json = (String) readFileUtil.readObjFromSDCard("obj");
        Gson gson = new Gson();
        ShopListBean shopListBean = gson.fromJson(json,ShopListBean.class);
        List<ShopListBean.DataBean.MachineAdvertisementListListBean> ad = shopListBean.getData().getMachineAdvertisementList_list();
        Glide.with(ShopActivity.this)
                .load(Urls.BASEIMAGEBEFORE+ad.get(0).getValue()+Urls.BASEIMAGEAFTER)
                .placeholder(R.drawable.tag)
                .crossFade()
                .into(imageView);
        List<ShopListBean.DataBean.ResultBean.MachineCategoryListBean> machineCategoryList = shopListBean.getData().getResult().getMachineCategoryList();
        ShopListBean.DataBean data = shopListBean.getData();
        ShopListBean.DataBean.ResultBean result = data.getResult();
        String toJson = gson.toJson(result);
        Log.d("xuezhiyuan",toJson);
        Map cate_product = result.getCate_product();
        if(machineCategoryList.size() > 5 || machineCategoryList.size() == 0){
            //弹出提示框
            Log.d("xuezhiyuan","数据超出范围");
        }else {
            switch (machineCategoryList.size()){
                case 1:{
                        int id = machineCategoryList.get(0).getId();
                        String idTab = String.valueOf(id);
                        List<MachineProduct> machineProductList = (List<MachineProduct>) cate_product.get(idTab);
                        EmptyFragment fragment = new EmptyFragment(machineProductList);
                        titles.addAll(machineCategoryList);
                        fragments.add(fragment);
                        pagerAdapter.notifyDataSetChanged();
                }
                break;
                case 2:{
                        for(int i = 0;i<machineCategoryList.size();i++){
                            int id = machineCategoryList.get(i).getId();
                            String idTab = String.valueOf(id);
                            List<MachineProduct> machineProductList = (List<MachineProduct>) cate_product.get(idTab);
                            EmptyFragment fragment = new EmptyFragment(machineProductList);
                            titles.addAll(machineCategoryList);
                            fragments.add(fragment);
                            titles.addAll(machineCategoryList);
                        }
                        pagerAdapter.notifyDataSetChanged();
                }
                break;
                case 3:{
                    for(int i = 0;i<machineCategoryList.size();i++){
                        int id = machineCategoryList.get(i).getId();
                        String idTab = String.valueOf(id);
                        List<MachineProduct> machineProductList = (List<MachineProduct>) cate_product.get(idTab);
                        EmptyFragment fragment = new EmptyFragment(machineProductList);
                        titles.addAll(machineCategoryList);
                        fragments.add(fragment);
                        titles.addAll(machineCategoryList);
                    }
                    pagerAdapter.notifyDataSetChanged();
                }
                break;
                case 4:{
                    for(int i = 0;i<machineCategoryList.size();i++){
                        int id = machineCategoryList.get(i).getId();
                        String idTab = String.valueOf(id);
                        List<MachineProduct> machineProductList = (List<MachineProduct>) cate_product.get(idTab);
                        EmptyFragment fragment = new EmptyFragment(machineProductList);
                        titles.addAll(machineCategoryList);
                        fragments.add(fragment);
                        titles.addAll(machineCategoryList);
                    }
                    pagerAdapter.notifyDataSetChanged();
                }
                break;
                case 5:{
                    for(int i = 0;i<machineCategoryList.size();i++){
                        int id = machineCategoryList.get(i).getId();
                        String idTab = String.valueOf(id);
                        List<MachineProduct> machineProductList = (List<MachineProduct>) cate_product.get(idTab);
                        EmptyFragment fragment = new EmptyFragment(machineProductList);
                        titles.addAll(machineCategoryList);
                        fragments.add(fragment);
                        titles.addAll(machineCategoryList);
                    }
                    pagerAdapter.notifyDataSetChanged();
                }
                break;
            }
        }
    }

    @Override
    public void in(Class tClass) {
        Intent intent = new Intent(this, tClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }



    public static  synchronized String getJsonStrFromNetData(String jsonString)
    {
        int first = jsonString.indexOf("[");
        int last = jsonString.lastIndexOf("]");
        String result = "";
        if (last > first) {
            result = jsonString.substring(first, last + 1);
        }
        return result;
    }


    public static synchronized <T> ArrayList<T> getEntityFromJson(String jsonStr,Class<T> classOfT) {
        try {
            jsonStr = getJsonStrFromNetData(jsonStr);
            Gson gson = new Gson();
            Type type = new TypeToken<ArrayList<JsonObject>>() {
            }.getType();

            ArrayList<JsonObject> jsObjs = gson.fromJson(jsonStr, type);
            ArrayList<T> listOfT = new ArrayList<T>();
            for (JsonObject obj : jsObjs) {
                listOfT.add(new Gson().fromJson(obj, classOfT));
            }
            return listOfT;
        } catch (Exception e) {
            return null;
        }
    }





    public static  synchronized  JSONObject  getJsonObject(String JsonString)
    {
        JSONObject jsonObject = null;
        try {
            JsonString = getJsonStrFromNetData(JsonString);
            JSONArray  entries = new JSONArray(JsonString);
            if(entries.length() > 0 )
            {
                jsonObject = entries.getJSONObject(0);
            }
            return jsonObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}





















/*Display display = getWindowManager().getDefaultDisplay();
                 int heigth = display.getWidth();
                 int width = display.getHeight();
                 Log.d("xuezhiyuan","宽："+width+"=="+"高："+heigth);*/