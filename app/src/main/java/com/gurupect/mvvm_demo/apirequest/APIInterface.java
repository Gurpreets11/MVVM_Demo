package com.gurupect.mvvm_demo.apirequest;

import com.google.gson.JsonObject;
import com.gurupect.mvvm_demo.model.RequestDto;
import com.gurupect.mvvm_demo.model.ResponseDTO;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface APIInterface {

    // Info mobile api call


    @POST("userLogin")
    Call<ResponseBody> userLogin(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("getUserDetails")
    Call<ResponseBody> getUserDetails(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("forgotPassword")
    Call<ResponseBody> forgotPassword(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("changesPassword")
    Call<ResponseBody> changePassword(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("singUp")
    Call<ResponseBody> userRegister(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("verifiedSingUP")
    Call<ResponseBody> userVerify(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("resendCode")
    Call<ResponseBody> resendCode(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("updateUserProfile")
    Call<ResponseBody> updateProfile(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("getInitialDetails")
    Call<ResponseBody> getInitialDetails(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("banner")
    Call<ResponseBody> getBanner(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("getBrandData")
    Call<ResponseBody> getTopBrandList(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("productSearch")
    Call<ResponseBody> getSearchArticleList(@Header("Content-Type") String type, @Body RequestDto requestDto);


    @POST("getArticleVendorList")
    Call<ResponseBody> getArticleVendorList(@Header("Content-Type") String type, @Body RequestDto requestDto);


    @POST("getProductFilterDetails")
    Call<ResponseBody> getArticleList(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("getProductDetails")
    Call<ResponseBody> getArticleDetail(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("getCartDetails")
    Call<ResponseBody> getCartList(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("addToCartProduct")
    Call<ResponseBody> getCartManage(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("addToCartProduct")
    Call<ResponseBody> getAddressUpdate(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("applyCoupanCode")
    Call<ResponseBody> getCouponApply(@Header("Content-Type") String type, @Body RequestDto requestDto);


    @POST("getOfferDetails")
    Call<ResponseBody> getOfferDetails(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("getFeedbackReviewDetails")
    Call<ResponseBody> getFeedbackReviewDetails(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("submitFeedbackDetails")
    Call<ResponseBody> submitFeedbackDetails(@Header("Content-Type") String type, @Body RequestDto requestDto);


    @POST("getProductParameterDetails")
    Call<ResponseBody> getArticleParamDetails(@Header("Content-Type") String type, @Body RequestDto requestDto);


    @POST("getUserAddressDetails")
    Call<ResponseBody> getUserAddressDetails(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("saveUpdateUserAddressDetails")
    Call<ResponseBody> saveUpdateUserAddressDetails(@Header("Content-Type") String type, @Body RequestDto requestDto);


    @POST("submitOrderDetails")
    Call<ResponseBody> submitOrderDetails(@Header("Content-Type") String type, @Body RequestDto requestDto);


    @POST("getOrderList")
    Call<ResponseDTO> getOrderList(@Header("Content-Type") String type, @Body RequestDto requestDto);


    @POST("getOrderWiseTransactionData")
    Call<ResponseBody> getOrderDetails(@Header("Content-Type") String type, @Body RequestDto requestDto);


    @POST("getVendorList")
    Call<ResponseBody> getVendorList(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("getFilterData")
    Call<ResponseBody> getFilterData(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("cancelOrder")
    Call<ResponseBody> cancelOrder(@Header("Content-Type") String type, @Body RequestDto requestDto);


    @POST("cancelOrderWiseItem")
    Call<ResponseBody> cancelOrderWiseItem(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("getRecentlyViewedProduct")
    Call<ResponseBody> getRecentlyViewedProduct(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("getSaleableProduct")
    Call<ResponseBody> getRecentlyBuyProduct(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("getSaleableProduct")
    Call<ResponseBody> getRecentlyBuyProductGrocery(@Header("Content-Type") String type, @Body RequestDto requestDto);
    @POST("getSaleableProduct")
    Call<ResponseBody> getRecentlyBuyProductElectronics(@Header("Content-Type") String type, @Body RequestDto requestDto);
    @POST("getSaleableProduct")
    Call<ResponseBody> getRecentlyBuyProductFashion(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("getOfferRateList")
    Call<ResponseBody> getOfferRateList(@Header("Content-Type") String type, @Body RequestDto requestDto);





    @POST("getOfferRateWiseItemList")
    Call<ResponseBody> getOfferRateWiseItemList(@Header("Content-Type") String type, @Body RequestDto requestDto);


    // @POST("getArticleVendorList")
    //Call<ResponseBody> getArticleVendorList(@Header("Content-Type") String type, @Body RequestDto requestDto);


    @FormUrlEncoded
    @POST("opennewregister")
    Call<ResponseBody> getNewRegisterOpen(@Header("Content-Type") String type, @Field("userId") String employeeID,
                                          @Field("impressionAmount") String floatingAmount);


    @GET("getAllBrands")
    Call<ResponseBody> getBrandList(@Header("Content-Type") String type);


  /*  @POST("getInitialDetails")
    Call<ResponseBody> getInitialDetails(@Header("Content-Type") String type, @Body RequestDto requestDto);

    @POST("getInitialDetails")
    Call<ResponseBody> getInitialDetails(@Header("Content-Type") String type, @Body RequestDto requestDto);

*/


    // userId, registerId, cardClosingAmount, cashClosingAmount
    // peerHuntr Api call


    @GET("cart/getPackage")
    Call<ResponseBody> getCreditData(@Header("Content-Type") String type);

    @POST("cart/buyProfileCardAction")
    Call<ResponseBody> buyProfileCardAction(@Header("Content-Type") String type, @Body JsonObject object);

    @POST("cart/checkBalance")
    Call<ResponseBody> checkOutProfileCardAction(@Header("Content-Type") String type, @Body JsonObject object);


}
