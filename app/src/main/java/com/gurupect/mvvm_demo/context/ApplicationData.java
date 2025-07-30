package com.gurupect.mvvm_demo.context;

import android.app.Application;

/**
 * Created by GURPREET SINGH on on 01/03/2018..
 */
public class ApplicationData extends Application {
    public static final String TAG = ApplicationData.class.getSimpleName();
    private static ApplicationData mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        init();
    }

    private void init() {
    }

    public static synchronized ApplicationData getInstance() {
        return mInstance;
    }
}
