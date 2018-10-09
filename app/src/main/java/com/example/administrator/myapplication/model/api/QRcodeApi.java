package com.example.administrator.myapplication.model.api;

import com.example.administrator.myapplication.base.Urls;
import com.example.administrator.myapplication.model.entity.QcodeBean;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 作者：zhiyuan Xue on 2018/9/7 17:49
 * 邮箱：xzy7319@sina.com
 */

public interface QRcodeApi {
    @GET(Urls.PAYQCODE)
    Call<JsonObject> getData(@Query("machineProductId") int id, @Query("machineId") int machineId);
}
