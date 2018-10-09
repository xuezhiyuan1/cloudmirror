package com.example.administrator.myapplication.model.api;

import com.example.administrator.myapplication.base.Urls;
import com.example.administrator.myapplication.model.entity.ShopListBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 作者：zhiyuan Xue on 2018/9/7 10:31
 * 邮箱：xzy7319@sina.com
 */

public interface WelcomeApi {
    @GET(Urls.DATAURL)
    Call<ShopListBean> getData(@Query("machineId") int machineId);
}
