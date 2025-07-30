package com.gurupect.mvvm_demo.viewmodels;

import com.gurupect.mvvm_demo.model.RequestDto;
import com.gurupect.mvvm_demo.model.ResponseDTO;
import com.gurupect.mvvm_demo.repositories.ApiDataProvider;
import com.gurupect.mvvm_demo.utils.Logger;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PosOrderViewModel extends ViewModel {

    private MutableLiveData<ResponseDTO> mutableLiveData;
    private ApiDataProvider newsRepository;

    public void init(RequestDto requestDto) {
        if (mutableLiveData != null) {
            return;
        }
        newsRepository = ApiDataProvider.getInstance();
        Logger.e("getNewsRepository method called..");
        mutableLiveData = newsRepository.getNews(requestDto);
    }

    public LiveData<ResponseDTO> getNewsRepository() {
        Logger.e("getNewsRepository method called..");
        return mutableLiveData;
    }

}
