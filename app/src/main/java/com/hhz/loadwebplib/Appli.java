package com.hhz.loadwebplib;

import android.app.Application;

import com.hhz.mywbplib.util.LoadUtil;

public class Appli extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LoadUtil.getInstance().init(this);
    }
}
