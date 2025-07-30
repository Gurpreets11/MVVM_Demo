package com.gurupect.mvvm_demo.apirequest;

/**
 * Created by GURPREET SINGH on 2/4/2018.
 */

public interface ResponseListener {

    //void getResponse(JsonObject response, String tag);

    //void getResponse(JsonArray response, String tag);

    void onResponseSuccess(String successStr, String tag, Object object);

    void onResponseError(String errorStr, String tag);
}
