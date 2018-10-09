package com.example.administrator.myapplication.model.http;

import android.widget.ImageView;

/**
 * 作者：zhiyuan Xue on 2018/9/7 18:49
 * 邮箱：xzy7319@sina.com
 */

public interface Iqcode {
    BaseOkHttp baseOkHttp = BaseOkHttp.getInstance();

    /**
     * 加载网络图片
     * @param imageView
     * @param imgUrl
     */
    void loadImageByUrl(ImageView imageView, String imgUrl);
}
