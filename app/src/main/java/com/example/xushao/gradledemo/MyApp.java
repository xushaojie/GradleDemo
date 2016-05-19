package com.example.xushao.gradledemo;

import android.app.Application;

/**
 * Created by shaojie.xu on 2016/5/19.
 */
public class MyApp extends Application {

    private static MyApp sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static MyApp getInstance() {
        return sInstance;
    }

}
