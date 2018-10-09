package com.example.administrator.myapplication.activity;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.base.BaseActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 作者：zhiyuan Xue on 2018/9/6 15:31
 * 邮箱：xzy7319@sina.com
 */

public class ShoppingCarActivity extends BaseActivity implements View.OnClickListener{

    private Timer timer = new Timer();
    private int time = 120;
    private TextView textViewValue;
    private LinearLayout linBack;
    private Button backBtn;

    @Override
    protected void layoutId() {
        setContentView(R.layout.shopping_car);
        timer.schedule(task, time, 1000);
    }

    @Override
    protected void initView() {
        backBtn = findViewById(R.id.back_list_shop);
        textViewValue = findViewById(R.id.value_Text);
        linBack = findViewById(R.id.back_Text);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        linBack.setOnClickListener(this);
        backBtn.setOnClickListener(this);
    }

    @Override
    protected void loadData() {

    }

    @Override
    public void in(Class tClass) {

    }

    TimerTask task = new TimerTask() {
        @Override public void run() {
            runOnUiThread(new Runnable() {
                @Override public void run() {
                    time--;
                    textViewValue.setText(String.valueOf(time)+"s");
                    textViewValue.setEnabled(false);
                    if (time <= 0) {
                        out();
                    }
                }
            });
        }
    };


    private void stopTimer(){

        if (task != null) {
            task.cancel();
            task = null;
        }

        if (task != null) {
            task.cancel();
            task = null;
        }
    }

    public void out() {
        finish();
        overridePendingTransition(R.anim.anim_in,R.anim.anim_out);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.back_Text:{
                stopTimer();
                out();
            }
            break;
            case R.id.back_list_shop:{
                stopTimer();
                out();
            }
            break;
        }
    }
}
