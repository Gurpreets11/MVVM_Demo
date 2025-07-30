package com.gurupect.mvvm_demo.model;

import java.io.Serializable;
import java.util.List;

public class POSOrderDTO implements Serializable {

    private int id;
    private String orderNumber;
    private Double totalAmount;
    private Double qty;
    private Double totalTax;
    private Double discount;
    private int userId;
    private String creationDatetime;
    private String lastUpdatedDatetime;
    private int status;
    private String remarks;
    private String paymentStatus;
    private Boolean isOfferApplied;
    private Boolean isShipingAdded;

    private int offerId;//Add New Variable 22072019
    private String offerCode;//Add New Variable 22072019

    private Double paidAmount;//Add New Variable 07082019
    private Double refundableAmount;//Add New Variable 07082019


    private List<VendorWiseTransactionDTO> vendorWiseTransactionDTO;
    private UserDetailsDTO sippingAddressData;
    private int statusDataChanged;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(Double totalTax) {
        this.totalTax = totalTax;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCreationDatetime() {
        return creationDatetime;
    }

    public void setCreationDatetime(String creationDatetime) {
        this.creationDatetime = creationDatetime;
    }

    public String getLastUpdatedDatetime() {
        return lastUpdatedDatetime;
    }

    public void setLastUpdatedDatetime(String lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Boolean isOfferApplied() {
        return isOfferApplied;
    }

    public void setOfferApplied(Boolean isOfferApplied) {
        this.isOfferApplied = isOfferApplied;
    }

    public Boolean isShipingAdded() {
        return isShipingAdded;
    }

    public void setShipingAdded(Boolean isShipingAdded) {
        this.isShipingAdded = isShipingAdded;
    }

    public List<VendorWiseTransactionDTO> getVendorWiseTransactionDTO() {
        return vendorWiseTransactionDTO;
    }

    public void setVendorWiseTransactionDTO(List<VendorWiseTransactionDTO> vendorWiseTransactionDTO) {
        this.vendorWiseTransactionDTO = vendorWiseTransactionDTO;
    }

    public UserDetailsDTO getSippingAddressData() {
        return sippingAddressData;
    }

    public void setSippingAddressData(UserDetailsDTO sippingAddressData) {
        this.sippingAddressData = sippingAddressData;
    }

    public int getStatusDataChanged() {
        return statusDataChanged;
    }

    public void setStatusDataChanged(int statusDataChanged) {
        this.statusDataChanged = statusDataChanged;
    }

    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public String getOfferCode() {
        return offerCode;
    }

    public void setOfferCode(String offerCode) {
        this.offerCode = offerCode;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Double getRefundableAmount() {
        return refundableAmount;
    }

    public void setRefundableAmount(Double refundableAmount) {
        this.refundableAmount = refundableAmount;
    }


}

