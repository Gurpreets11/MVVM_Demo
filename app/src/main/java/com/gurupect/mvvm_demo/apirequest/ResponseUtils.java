package com.gurupect.mvvm_demo.apirequest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.gurupect.mvvm_demo.constant.AppConstant;
import com.gurupect.mvvm_demo.utils.AppToast;
import com.gurupect.mvvm_demo.utils.Logger;

import java.io.IOException;

import androidx.annotation.NonNull;
import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Created by gurpreet.singh on 3/9/2018.
 */

public class ResponseUtils {

    public static ErrorDto handleInternalServerErrorResponse(Response<ResponseBody> response) {
        try {
            String responseST = response.errorBody().string();
            return getErrorDto(responseST);
        } catch (IOException e) {
            return new ErrorDto();
        }
    }

    public static ErrorDto handleInternalServerErrorResponseJsonArray(Response<JsonArray> response) {
        try {
            String responseST = response.errorBody().string();
            return getErrorDto(responseST);
        } catch (IOException e) {
            return new ErrorDto();
        }
    }

    public static ErrorDto handleInternalServerErrorResponseJsonObject(Response<JsonObject> response) {
        try {
            String responseST = response.errorBody().string();
            return getErrorDto(responseST);
        } catch (IOException e) {
            return new ErrorDto();
        }
    }

    @NonNull
    private static ErrorDto getErrorDto(String responseST) {
        Gson gson = new GsonBuilder().create();
        ErrorDto mError = new ErrorDto();
        responseST = responseST.replaceAll("^\"|\"$", "");
        Logger.e("mError  :: " + mError.getERROR_MSG());
        if (responseST.startsWith("{")) {
            mError = gson.fromJson(responseST, ErrorDto.class);
            AppToast.showMsgShort(mError.getERROR_MSG());
        } else {
            AppToast.showMsgShort(AppConstant.SERVER_ERROR);
        }
        return mError;
    }
}
