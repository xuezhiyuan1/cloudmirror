package com.example.administrator.myapplication.base;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.example.administrator.myapplication.R;


/**
 * Created by Administrator on 2018/8/24.
 */

public  abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.context = this;
        layoutId();
        initView();
        initData();
        initListener();
        loadData();
    }

    //布局绑定
    protected abstract void layoutId();
    //初始化view
    protected abstract void initView();
    //初始化数据
    protected abstract void initData();
    //初始化监听
    protected abstract void initListener();
    //加载数据
    protected abstract void loadData();

    //跳转Activity
    public abstract void in(Class tClass);

    //回退Activity
    public void out() {
        finish();
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }


    /*//BACK键
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            out();
            return false;
        }else {
            return super.onKeyDown(keyCode, event);
        }
    }*/




}
