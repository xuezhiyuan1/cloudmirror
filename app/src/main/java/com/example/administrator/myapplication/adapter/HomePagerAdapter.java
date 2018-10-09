package com.example.administrator.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.example.administrator.myapplication.base.BaseFragment;
import com.example.administrator.myapplication.model.entity.ShopListBean;

import java.util.List;



public class HomePagerAdapter extends FragmentPagerAdapter {

    private List<BaseFragment> fragments;
    private List<ShopListBean.DataBean.ResultBean.MachineCategoryListBean> titles;
    public HomePagerAdapter(FragmentManager fm, List<BaseFragment> fragments, List<ShopListBean.DataBean.ResultBean.MachineCategoryListBean> titles) {
        super(fm);
        this.fragments = fragments;
        this.titles = titles;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get( position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position).getName();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
            //super.destroyItem(container, position, object);
    }
}
