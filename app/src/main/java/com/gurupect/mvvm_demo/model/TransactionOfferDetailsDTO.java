package com.gurupect.mvvm_demo.model;

import java.io.Serializable;

public class TransactionOfferDetailsDTO implements Serializable {
	
	  private int transId;
	  private String offerName;
	  private String discountType;
	  private float discountedAmount;
	  private float discountRate;
	  private int status;
	  
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public float getDiscountedAmount() {
		return discountedAmount;
	}
	public void setDiscountedAmount(float discountedAmount) {
		this.discountedAmount = discountedAmount;
	}
	public float getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}	  
}
