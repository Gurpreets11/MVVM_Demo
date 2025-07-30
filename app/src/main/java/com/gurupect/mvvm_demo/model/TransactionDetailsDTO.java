package com.gurupect.mvvm_demo.model;

import java.io.Serializable;
import java.util.List;

public class TransactionDetailsDTO implements Serializable {

    private int articleId;
    private String articleCode;
    private String aticleName;
    private String desription;
    private String serialNumber1;
    private String serialNumber2;
    private float qty;
    private Double mrp;
    private Double db;
    private Double map;
    private String hsn;
    private String itemReturn;
    private String totalTax;
    private String cFormStatus;
    private Double totalDiscount;
    private String reasonCode;
    private String remarks;
    private String referenceType;

    private List<TransactionItemWiseDiscountDTO> transactionItemWiseDiscountList;
    private List<TransactionTaxDetailsDTO> transactionTaxDetailsList;
    private String transType;
    private Double extendedPrice;
    private Double taxPercentage;
    private int inventoryId;
    private String orginalInvoiceNumber;
    private String imageLocation;
    private int status; //Changes in 08082019

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleCode() {
        return articleCode;
    }

    public void setArticleCode(String articleCode) {
        this.articleCode = articleCode;
    }

    public String getAticleName() {
        return aticleName;
    }

    public void setAticleName(String aticleName) {
        this.aticleName = aticleName;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public String getSerialNumber1() {
        return serialNumber1;
    }

    public void setSerialNumber1(String serialNumber1) {
        this.serialNumber1 = serialNumber1;
    }

    public String getSerialNumber2() {
        return serialNumber2;
    }

    public void setSerialNumber2(String serialNumber2) {
        this.serialNumber2 = serialNumber2;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }

    public Double getMrp() {
        return mrp;
    }

    public void setMrp(Double mrp) {
        this.mrp = mrp;
    }

    public Double getDb() {
        return db;
    }

    public void setDb(Double db) {
        this.db = db;
    }

    public Double getMap() {
        return map;
    }

    public void setMap(Double map) {
        this.map = map;
    }

    public String getHsn() {
        return hsn;
    }

    public void setHsn(String hsn) {
        this.hsn = hsn;
    }

    public String getItemReturn() {
        return itemReturn;
    }

    public void setItemReturn(String itemReturn) {
        this.itemReturn = itemReturn;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public String getcFormStatus() {
        return cFormStatus;
    }

    public void setcFormStatus(String cFormStatus) {
        this.cFormStatus = cFormStatus;
    }

    public Double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public List<TransactionTaxDetailsDTO> getTransactionTaxDetailsList() {
        return transactionTaxDetailsList;
    }

    public void setTransactionTaxDetailsList(List<TransactionTaxDetailsDTO> transactionTaxDetailsList) {
        this.transactionTaxDetailsList = transactionTaxDetailsList;
    }

    public List<TransactionItemWiseDiscountDTO> getTransactionItemWiseDiscountList() {
        return transactionItemWiseDiscountList;
    }

    public void setTransactionItemWiseDiscountList(List<TransactionItemWiseDiscountDTO> transactionItemWiseDiscountList) {
        this.transactionItemWiseDiscountList = transactionItemWiseDiscountList;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public Double getExtendedPrice() {
        return extendedPrice;
    }

    public void setExtendedPrice(Double extendedPrice) {
        this.extendedPrice = extendedPrice;
    }

    public Double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(Double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getOrginalInvoiceNumber() {
        return orginalInvoiceNumber;
    }

    public void setOrginalInvoiceNumber(String orginalInvoiceNumber) {
        this.orginalInvoiceNumber = orginalInvoiceNumber;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
