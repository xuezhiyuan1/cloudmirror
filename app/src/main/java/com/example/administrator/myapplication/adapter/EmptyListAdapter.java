package com.example.administrator.myapplication.adapter;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.base.App;
import com.example.administrator.myapplication.base.CommonAdapter;
import com.example.administrator.myapplication.base.ViewHolder;
import com.example.administrator.myapplication.model.entity.MachineProduct;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

/**
 * 作者：zhiyuan Xue on 2018/8/31 17:13
 * 邮箱：xzy7319@sina.com
 */

public class EmptyListAdapter extends CommonAdapter<MachineProduct> {

    public EmptyListAdapter(Context context, List<MachineProduct> data, int layoutId) {
        super(context, data, layoutId);
    }

    @Override
    public void display(ViewHolder holder, final MachineProduct shopContentBeans) {
            holder.setText(R.id.shop_content_info, shopContentBeans.getProductName1());
            holder.setImage(R.id.image_info, shopContentBeans.getImage());
            TextView textView_original = holder.getConvertView().findViewById(R.id.original_price);
            textView_original.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
            String valueOf_original = String.valueOf(shopContentBeans.getMachineSkuPriceOriginal());
            double original = Double.parseDouble(valueOf_original);
            double originals = original / 100;
            NumberFormat nf = new DecimalFormat("##.##");
            String str = nf.format(originals);
            textView_original.setText("￥"+str);
            TextView textView_current = holder.getConvertView().findViewById(R.id.current_price);
            String valueOf_current = String.valueOf(shopContentBeans.getMachineSkuPriceCurrent());
            double current = Double.parseDouble(valueOf_current);
            double currents = current / 100;
            String str2 = nf.format(currents);
            textView_current.setText("￥"+str2);
            /*ImageView imageView = holder.getConvertView().findViewById(R.id.shopping_btn);
            imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentQuan = shopContentBeans.getCurrentQuan();
                Toast.makeText(App.context,"库存还有"+currentQuan+"个",Toast.LENGTH_SHORT).show();
              }
            });*/
            if(shopContentBeans.getCurrentQuan() == 0){
                @SuppressLint("WrongViewCast") LinearLayout linearLayout = holder.getConvertView().findViewById(R.id.tagImages);
                linearLayout.setClickable(false);
                linearLayout.setOnClickListener(null);
                linearLayout.setBackgroundResource(R.drawable.shape_corner_up);
                linearLayout.setPadding(20,20,20,20);
             }
    }
}
