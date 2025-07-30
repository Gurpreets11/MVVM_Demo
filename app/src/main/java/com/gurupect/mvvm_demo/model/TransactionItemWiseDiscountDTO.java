package com.gurupect.mvvm_demo.model;

import java.io.Serializable;

public class TransactionItemWiseDiscountDTO implements Serializable {
	
	  private int articleId;
	  private String offerName;
	  private String discountType;
	  private float discountedAmount;
	  private float discountRate;
	  private int status;
	private int itemWiseDiscountId;
	private String discountDescription;
	private float discountedPrice;
	private float basePrice;
	  
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
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


	public int getItemWiseDiscountId() {
		return itemWiseDiscountId;
	}

	public void setItemWiseDiscountId(int itemWiseDiscountId) {
		this.itemWiseDiscountId = itemWiseDiscountId;
	}

	public String getDiscountDescription() {
		return discountDescription;
	}

	public void setDiscountDescription(String discountDescription) {
		this.discountDescription = discountDescription;
	}

	public float getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(float discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public float getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}
}
