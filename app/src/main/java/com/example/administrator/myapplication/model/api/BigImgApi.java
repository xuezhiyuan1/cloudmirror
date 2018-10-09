package com.example.administrator.myapplication.model.api;

import com.example.administrator.myapplication.base.Urls;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 作者：zhiyuan Xue on 2018/9/11 14:29
 * 邮箱：xzy7319@sina.com
 */

public interface BigImgApi {
    @GET(Urls.PREPAYURL)
    Call<JsonObject> getData(@Query("machineProductId") int id, @Query("machineId") int machineId);
}
