package com.example.administrator.myapplication.model.api;

import com.example.administrator.myapplication.base.Urls;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 作者：zhiyuan Xue on 2018/9/11 16:49
 * 邮箱：xzy7319@sina.com
 */

public interface PayStateApi {
    @GET(Urls.CHECKONESBUY)
    Call<JsonObject> getData(@Query("orderId") int orderId);
}
