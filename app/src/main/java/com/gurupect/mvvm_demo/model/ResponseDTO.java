package com.gurupect.mvvm_demo.model;

import java.io.Serializable;
import java.util.Map;

public class ResponseDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8955684270431897207L;

    private String tokenNumber;
    //private ExceptionWSDTO exceptionDTO;

    //Code : 200-Success 404-Failed
    private Integer responseCode;
    // Success,Failed
    private String responseStatus;
    //User Login,Tender,RegisterOpen
    private String responseDesc;

    private String requestType;

    private Object requestTypeObjectStatus;
    private Object requestTypeObject;

    private Map<String, Object> requestObjects;

    private String responseId;

    private String appUrl;

    private Integer cartCount;

    public Object getRequestTypeObjectStatus() {
        return requestTypeObjectStatus;
    }

    public void setRequestTypeObjectStatus(Object requestTypeObjectStatus) {
        this.requestTypeObjectStatus = requestTypeObjectStatus;
    }


    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    /*public ExceptionWSDTO getExceptionDTO() {
        return exceptionDTO;
    }
    public void setExceptionDTO(ExceptionWSDTO exceptionDTO) {
        this.exceptionDTO = exceptionDTO;
    }*/
    public Object getRequestTypeObject() {
        return requestTypeObject;
    }

    public void setRequestTypeObject(Object requestTypeObject) {
        this.requestTypeObject = requestTypeObject;
    }

    public String getTokenNumber() {
        return tokenNumber;
    }

    public void setTokenNumber(String tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    public String getResponseDesc() {
        return responseDesc;
    }

    public void setResponseDesc(String responseDesc) {
        this.responseDesc = responseDesc;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public Map<String, Object> getRequestObjects() {
        return requestObjects;
    }

    public void setRequestObjects(Map<String, Object> requestObjects) {
        this.requestObjects = requestObjects;
    }

    public Integer getCartCount() {
        return cartCount;
    }

    public void setCartCount(Integer cartCount) {
        this.cartCount = cartCount;
    }
}