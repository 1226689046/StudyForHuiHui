package com.bang_tang.studyforhuihui.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * 项目名：StudyForHuiHui
 * 包名：com.bang_tang.studyforhuihui.adapter
 * 文件名：GuideAdapter
 * 创建者：Wsr
 * 创建时间:2017/9/721:20
 * 描述：guide中ViewPager的适配器
 */

public class GuideAdapter extends PagerAdapter {
    private List<View> viewList;
    private Context mContext;
    public GuideAdapter(Context mContext, List<View> viewList) {
        this.viewList = viewList;
        this.mContext = mContext;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ((ViewPager)container).addView(viewList.get(position));
        return viewList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager)container).removeView(viewList.get(position));
    }

    @Override
    public int getCount() {
        return viewList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}

