package com.gurupect.mvvm_demo.constant;

public class ApiConstant {

    // New Public IP
    public static String LIVE_SERVER_URL = "http://148.66.133.56:8835/";

    private static String DEV_SERVER_URL = "http://192.168.0.16:8835/motiz/";


    public static String BASE_URL = LIVE_SERVER_URL + "BPOSEcommerce/";//BPOSEcommerce


    public static long TIMEOUT = 90;

    public static int RESPONSE_CODE_0 = 0;
    public static int RESPONSE_CODE_100 = 100;
    public static int RESPONSE_CODE_200 = 200;
    public static int RESPONSE_CODE_201 = 201;
    public static int RESPONSE_CODE_300 = 300;
    public static int RESPONSE_CODE_400 = 400;
    public static int RESPONSE_CODE_500 = 500;

    public static String STATUS_OK = "200";
    public static String STATUS_OK1 = "201";
    public static String STATUS_OK2 = "202";
    public static String STATUS_OK3 = "203";
    public static String STATUS_ALREADY_EXIST = "201";
    public static String STATUS_ERROR_400 = "400";
    public static String STATUS_ERROR_300 = "300";
    public static int STATUS_BAD_REQUEST = 400;
    public static String STATUS_ERROR_500 = "500";
    public static String REQUEST_TYPE_JSON = "application/json";
    public static String OS_TYPE = "Android";
    public static String REQUEST_TYPE_URL_ENCODER = "application/x-www-form-urlencoded";


}
