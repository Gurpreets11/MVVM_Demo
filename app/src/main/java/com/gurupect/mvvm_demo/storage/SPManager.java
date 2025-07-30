package com.gurupect.mvvm_demo.storage;

import android.app.Activity;
import android.content.SharedPreferences;

import com.gurupect.mvvm_demo.context.ApplicationData;
import com.gurupect.mvvm_demo.utils.Logger;

/**
 * Created by GURPREET SINGH on 01/03/2018..
 */
public class SPManager {

    private static final String TAG = "SHARED_PREF_MANAGER";
    private static final String INFOPOS_SHARED_PREFRENCES = "peerhuntrsharedpref";
    public static final String APP_VERSION_CODE = "appversioncode";
    public static final String NETWORK_OPERATOR = "networkoperator";
    public static final String SYSTEM_DATE = "systemdate";
    public static final String CHANGE_PASSWORD = "change_password";
    //  public static final String CUSTOMER_ID = "customer_id";
    public static final String CUSTOMER_EMAIL = "customer_email";
    public static final String CUSTOMER_FIRSTNAME = "first_name";
    public static final String CUSTOMER_LASTNAME = "last_name";
    public static final String CUSTOMER_TYPE_ID = "customer_type_id";
    public static final String REDIRECT_TO = "redirect";
    public static final String SEARCH_QUERY = "search_query";
    public static final String USER_DATA = "user_data";
    public static final String FIREBASE_TOKEN = "firebase_token";
    public static final String POST_RADIUS = "post_radius";
    public static final String UPDATE_POST_ACC_TO_RADIUS = "update_post";
    public static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    public static final String UPDATE_GPS = "update_gps";
    public static final String CART_COUNT = "cart_couunt";

    public static final String SESSION_KEY = "session";
    public static final String USER_ID = "user_id";
    public static final String USER_ID_FOR_TEST = "user_id_test";
    public static final String USER_LOGIN_ID = "user_login_id";


    public static final String USER_IMAGE_URL = "user_image_url";

    public static final String USER_STATUS = "user_status";
    public static final String USER_EMAIL_VERIFIED = "user_email_verified";
    public static final String USER_ROLE = "user_role";

    public static final String IS_FIRST_TEST = "first_test";
    public static final String IS_OPEN_PROFILE = "open_profile";
    public static final String CREDIT_VALUE = "credit_value";

    public static final String EMPLOYEE_NAME = "employee_name";
    public static final String EMPLOYEE_ID = "employee_id";
    public static final String REGISTER_ID = "register_id";
    public static final String REGISTER_CODE = "register_code";
    public static final String STORE_ID = "store_id";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String CANCEL_TRANS_ACCESS = "cancel_trans_access";
    // isCancelTransactionAccess
    public static final String TRANSACTION_ID = "null";
    private SharedPreferences sharedPreferences;

    private volatile static SPManager spManager = null;

    private SPManager() {
        sharedPreferences = ApplicationData.getInstance().getApplicationContext().getSharedPreferences(INFOPOS_SHARED_PREFRENCES,
                Activity.MODE_PRIVATE);
    }

    public static SPManager getInstance() {
        if (spManager == null) {
            synchronized (SPManager.class) {
                if (spManager == null) {
                    spManager = new SPManager();
                }
            }
        }
        return spManager;
    }

    public void clearPref() {
        try {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.clear();
            editor.apply();

        } catch (Exception e) {
            Logger.e(TAG, "putPref(): ", e);
        }
    }

    public void putPref(String aKey, String aVal) {
        try {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(aKey, aVal);
            editor.apply();
        } catch (Exception e) {
            Logger.e(TAG, "putPref(): ", e);
        }
    }

    public void putBooleanPref(String aKey, boolean aVal) {
        try {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean(aKey, aVal);
            editor.apply();
        } catch (Exception e) {
            Logger.e(TAG, "putBooleanPref(): ", e);
        }
    }

    public void putIntPref(String aKey, int aVal) {
        try {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt(aKey, aVal);
            editor.apply();
        } catch (Exception e) {
            Logger.e(TAG, "putIntPref(): ", e);
        }
    }

    public String getPref(String aKey) {
        String str = sharedPreferences.getString(aKey, null);
        return str;
    }

    public boolean getBooleanPref(String aKey) {
        return (sharedPreferences.getBoolean(aKey, false));
    }

    public int getIntPref(String aKey) {
        return (sharedPreferences.getInt(aKey, 0));
    }
}
