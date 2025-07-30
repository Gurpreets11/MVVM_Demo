package com.gurupect.mvvm_demo.model;

import java.io.Serializable;


public class OfferDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1669360848120460956L;

	private Integer offerId;
	private String offerName;
	private String offerShortName;
	private Double rate;
	private Double value;
	private String offerOn;
	private Integer vendorId;
	private Integer articleId;
	private String articleName;
	private Integer isExchangeOfferAvailable;
	private Double exchangeOfferAmount;
	private Integer userId;
	private String effectiveFrom;
	private String effectiveTo;
	private int bannerId;
	private String vendorCode;
	private String vendorName;
	private String vendorShopName;
	private String contactNo;
	private String emailId;
	private String location;
	private float  offerAmount;
	private POSArticleDTO posArticleDTO;

	public Integer getOfferId() {
		return offerId;
	}
	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public String getOfferShortName() {
		return offerShortName;
	}
	public void setOfferShortName(String offerShortName) {
		this.offerShortName = offerShortName;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getOfferOn() {
		return offerOn;
	}
	public void setOfferOn(String offerOn) {
		this.offerOn = offerOn;
	}
	public Integer getVendorId() {
		return vendorId;
	}
	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}
	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public Integer getIsExchangeOfferAvailable() {
		return isExchangeOfferAvailable;
	}
	public void setIsExchangeOfferAvailable(Integer isExchangeOfferAvailable) {
		this.isExchangeOfferAvailable = isExchangeOfferAvailable;
	}
	public Double getExchangeOfferAmount() {
		return exchangeOfferAmount;
	}
	public void setExchangeOfferAmount(Double exchangeOfferAmount) {
		this.exchangeOfferAmount = exchangeOfferAmount;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getEffectiveFrom() {
		return effectiveFrom;
	}
	public void setEffectiveFrom(String effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}
	public String getEffectiveTo() {
		return effectiveTo;
	}
	public void setEffectiveTo(String effectiveTo) {
		this.effectiveTo = effectiveTo;
	}
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorShopName() {
		return vendorShopName;
	}
	public void setVendorShopName(String vendorShopName) {
		this.vendorShopName = vendorShopName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getBannerId() {
		return bannerId;
	}
	public void setBannerId(int bannerId) {
		this.bannerId = bannerId;
	}
	public float getOfferAmount() {
		return offerAmount;
	}
	public void setOfferAmount(float offerAmount) {
		this.offerAmount = offerAmount;
	}


	public POSArticleDTO getPosArticleDTO() {
		return posArticleDTO;
	}
	public void setPosArticleDTO(POSArticleDTO posArticleDTO) {
		this.posArticleDTO = posArticleDTO;
	}
	
	
}
