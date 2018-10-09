package com.example.administrator.myapplication.model.api;

import com.example.administrator.myapplication.base.Urls;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 作者：zhiyuan Xue on 2018/9/13 12:16
 * 邮箱：xzy7319@sina.com
 */

public interface OpenDoorApi {
    @GET(Urls.OPENDOOR)
    Call<JsonObject> getData(@Query("machineId") int machineId, @Query("imachineId") int imachineId);
}
