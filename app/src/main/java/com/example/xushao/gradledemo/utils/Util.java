package com.example.xushao.gradledemo.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/**
 * 应用辅助类
 *
 * @author Xushao
 * @date 2016-05-23
 */
public class Util {

    public static <T> T getMetaData(Context context, String name) {
        try {
            ApplicationInfo ai = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            if (ai.metaData != null) {
                return (T) ai.metaData.get(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getMarketChannel(Context context) {
        String channel = getMetaData(context, "MARKET_CHANNEL");
        if (channel != null) {
            return channel;
        }
        return "";
    }

}
