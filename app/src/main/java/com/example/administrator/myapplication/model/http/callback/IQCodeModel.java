package com.example.administrator.myapplication.model.http.callback;

import com.example.administrator.myapplication.model.http.Iqcode;

import java.util.Map;

/**
 * 作者：zhiyuan Xue on 2018/9/7 18:52
 * 邮箱：xzy7319@sina.com
 */

public interface IQCodeModel<T> extends Iqcode {

    void getQcodeImageUrl(String url, Map<String,String> params,ResultCallBack<T> callBack);
}
