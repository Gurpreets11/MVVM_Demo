package com.gurupect.mvvm_demo.apirequest;


import com.gurupect.mvvm_demo.constant.ApiConstant;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    public static Retrofit getClient() {
        String SERVER_URL = ApiConstant.BASE_URL;
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);



        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .readTimeout(ApiConstant.TIMEOUT, TimeUnit.SECONDS)
                .connectTimeout(ApiConstant.TIMEOUT, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        return retrofit;



        /*OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request original = chain.request();

                Request request = original.newBuilder()
                        .header("User-Agent", "Your-App-Name")
                        .header("Accept", "application/vnd.yourapi.v1.full+json")
                        .method(original.method(), original.body())
                        .build();

                return chain.proceed(request);
            }
        });
        OkHttpClient client = httpClient.build();*/

    }


 /*   private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(ApiConstant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();*/


    public static <S> S cteateService(Class<S> serviceClass) {
        return APIClient.getClient().create(serviceClass);
    }

}