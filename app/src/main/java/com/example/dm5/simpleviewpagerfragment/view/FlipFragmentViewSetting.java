package com.example.dm5.simpleviewpagerfragment.view;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import java.util.ArrayList;

/**
 * Created by zhenfei.wang on 2016/6/24.
 */
public class FlipFragmentViewSetting implements BaseViewSetting{
    private ArrayList<String> titles;
    private ArrayList<Fragment> fragments;
    private int titleUnCheckTextColor = 0xFF000000;
    private int titleCheckTextColor = 0xFF2092E3;
    private int bgLineColor = 0xFF017DD7;
    private int currentPage = 0;
    
    public FlipFragmentViewSetting() {
        titles = new ArrayList<>();
        fragments = new ArrayList<>();
    }

    public ArrayList<String> getTitles() {
        return titles;
    }

    public ArrayList<Fragment> getFragments() {
        return fragments;
    }

    public int getTitleUnCheckTextColor() {
        return titleUnCheckTextColor;
    }

    public void setTitleUnCheckTextColor(int titleUnCheckTextColor) {
        this.titleUnCheckTextColor = titleUnCheckTextColor;
    }

    public int getTitleCheckTextColor() {
        return titleCheckTextColor;
    }

    public void setTitleCheckTextColor(int titleCheckTextColor) {
        this.titleCheckTextColor = titleCheckTextColor;
    }

    public int getBgLineColor() {
        return bgLineColor;
    }

    public void setBgLineColor(int bgLineColor) {
        this.bgLineColor = bgLineColor;
    }
    
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
    
    public void addPage(String title, Fragment fragment){
        if(!TextUtils.isEmpty(title) && fragment != null){
            titles.add(title);
            fragments.add(fragment);
        }
    }



}
