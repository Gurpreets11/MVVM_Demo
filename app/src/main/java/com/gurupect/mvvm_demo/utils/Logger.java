package com.gurupect.mvvm_demo.utils;

import android.util.Log;

import com.gurupect.mvvm_demo.constant.AppConstant;

public class Logger {

    private static String TAG = "TAG";

    public static void v(String message) {
        if (AppConstant.DEV_MODE.equalsIgnoreCase(AppConstant.DEV_MODE_DEVELOPMENT))
            Log.v(TAG, message);
    }

    public static void v(String tag, String message) {
        if (AppConstant.DEV_MODE.equalsIgnoreCase(AppConstant.DEV_MODE_DEVELOPMENT))
            Log.v(tag, message);
    }

    public static void e(String message) {
        if (AppConstant.DEV_MODE.equalsIgnoreCase(AppConstant.DEV_MODE_DEVELOPMENT))
            Log.e(TAG, message);
    }

    public static void e(String tag, String message) {
        if (AppConstant.DEV_MODE.equalsIgnoreCase(AppConstant.DEV_MODE_DEVELOPMENT))
            Log.e(tag, message);
    }

    public static void e(String tag, String message, Exception er) {
        if (AppConstant.DEV_MODE.equalsIgnoreCase(AppConstant.DEV_MODE_DEVELOPMENT))
            Log.e(tag, message, er);
    }

    public static void d(String message) {
        if (AppConstant.DEV_MODE.equalsIgnoreCase(AppConstant.DEV_MODE_DEVELOPMENT))
            Log.d(TAG, message);
    }

    public static void d(String tag, String message) {
        if (AppConstant.DEV_MODE.equalsIgnoreCase(AppConstant.DEV_MODE_DEVELOPMENT))
            Log.d(tag, message);
    }

    public static void i(String message) {
        if (AppConstant.DEV_MODE.equalsIgnoreCase(AppConstant.DEV_MODE_DEVELOPMENT))
            Log.i(TAG, message);
    }

    public static void i(String tag, String message) {
        if (AppConstant.DEV_MODE.equalsIgnoreCase(AppConstant.DEV_MODE_DEVELOPMENT))
            Log.i(tag, message);
    }

    public static void w(String message) {
        if (AppConstant.DEV_MODE.equalsIgnoreCase(AppConstant.DEV_MODE_DEVELOPMENT))
            Log.w(TAG, message);
    }

    public static void w(String tag, String message) {
        if (AppConstant.DEV_MODE.equalsIgnoreCase(AppConstant.DEV_MODE_DEVELOPMENT))
            Log.w(tag, message);
    }
}
