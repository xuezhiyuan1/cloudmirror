package com.example.administrator.myapplication.model.http.callback;

import android.widget.ImageView;

import com.example.administrator.myapplication.model.http.Iqcode;

import java.util.Map;

/**
 * 作者：zhiyuan Xue on 2018/9/7 18:50
 * 邮箱：xzy7319@sina.com
 */

public class QCodeModelImp implements IQCodeModel {


    @Override
    public void getQcodeImageUrl(String url, Map params, ResultCallBack callBack) {
        baseOkHttp.get(url,params,callBack);
    }

    @Override
    public void loadImageByUrl(ImageView imageView, String imgUrl) {

    }
}
