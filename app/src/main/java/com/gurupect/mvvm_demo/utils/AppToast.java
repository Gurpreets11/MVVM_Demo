package com.gurupect.mvvm_demo.utils;

import android.view.Gravity;
import android.widget.Toast;

import com.gurupect.mvvm_demo.constant.AppConstant;
import com.gurupect.mvvm_demo.context.ContextManager;


/**
 * Created by GURPREET SINGH on 01/03/2018..
 */

public class AppToast {

    public static void showMsgLong(String message) {
        Toast t = Toast.makeText(ContextManager.getInstance().getAppContext(), message, Toast.LENGTH_LONG);
        t.setGravity(Gravity.TOP, 10, 100);
        t.show();

    }



    public static void showMsgShort(String message) {
        Toast t = Toast.makeText(ContextManager.getInstance().getAppContext(), message, Toast.LENGTH_SHORT);
        t.setGravity(Gravity.TOP, 10, 100);
        t.show();
    }

    public static void showNetworkErrorMsg() {
        Toast t = Toast.makeText(ContextManager.getInstance().getAppContext(), AppConstant.NETWORK_CONNECTED, Toast.LENGTH_SHORT);
        t.setGravity(Gravity.TOP, 10, 100);
        t.show();
    }

}
