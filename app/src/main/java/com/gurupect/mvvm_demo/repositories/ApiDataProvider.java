package com.gurupect.mvvm_demo.repositories;

import com.gurupect.mvvm_demo.apirequest.APIClient;
import com.gurupect.mvvm_demo.apirequest.APIInterface;
import com.gurupect.mvvm_demo.constant.ApiConstant;
import com.gurupect.mvvm_demo.model.RequestDto;
import com.gurupect.mvvm_demo.model.ResponseDTO;
import com.gurupect.mvvm_demo.utils.Logger;

import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiDataProvider {

    private static String MSG_SUCCESS = "SUCCESS";
    private static String MSG_ERROR = "ERROR";
    // private static APIInterface apiInterface = APIClient.getClient().create(APIInterface.class);

    private static ApiDataProvider newsRepository;
    private static APIInterface newsApi;

    public static ApiDataProvider getInstance() {
        if (newsRepository == null) {
            newsRepository = new ApiDataProvider();
        }
        return newsRepository;
    }

    private ApiDataProvider() {
        newsApi = APIClient.cteateService(APIInterface.class);
    }

    public MutableLiveData<ResponseDTO> getNews(RequestDto requestDto) {

        Logger.e("ApiDataProvider.getNews() method called..");
        MutableLiveData<ResponseDTO> newsData = new MutableLiveData<>();
        newsApi.getOrderList(ApiConstant.REQUEST_TYPE_JSON, requestDto).enqueue(new Callback<ResponseDTO>() {
            @Override
            public void onResponse(Call<ResponseDTO> call, Response<ResponseDTO> response) {
                if (response.isSuccessful()) {
                    newsData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<ResponseDTO> call, Throwable t) {
                newsData.setValue(null);
            }
        });
        return newsData;
    }

}
