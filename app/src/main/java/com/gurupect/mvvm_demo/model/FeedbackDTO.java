package com.gurupect.mvvm_demo.model;

import java.io.Serializable;


public class FeedbackDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1669360848120460956L;
	
	private Integer feedbackId;
	private Integer userId;
    private Integer ratingId;
    private String type;
    private Integer id;
    private String feedback;
    private String suggestions;
    private String other;
	private Double latitude;
	private Double longitude;
	private String provider;
	private Long fixTime;
	private Double accuracy;
	private String serverDatetime;
    private String clientDateTime;
    
    private String userName;
    private String vendorCode;
    private String vendorName;
    private String articleCode;
    private String articleName;
    private String consultantCode;
    private String consultantName;
    private String bookingCode;
    private int status;
    
	public Integer getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getRatingId() {
		return ratingId;
	}
	public void setRatingId(Integer ratingId) {
		this.ratingId = ratingId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public Long getFixTime() {
		return fixTime;
	}
	public void setFixTime(Long fixTime) {
		this.fixTime = fixTime;
	}
	public Double getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(Double accuracy) {
		this.accuracy = accuracy;
	}
	public String getServerDatetime() {
		return serverDatetime;
	}
	public void setServerDatetime(String serverDatetime) {
		this.serverDatetime = serverDatetime;
	}
	public String getClientDateTime() {
		return clientDateTime;
	}
	public void setClientDateTime(String clientDateTime) {
		this.clientDateTime = clientDateTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getArticleCode() {
		return articleCode;
	}
	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public String getConsultantCode() {
		return consultantCode;
	}
	public void setConsultantCode(String consultantCode) {
		this.consultantCode = consultantCode;
	}
	public String getConsultantName() {
		return consultantName;
	}
	public void setConsultantName(String consultantName) {
		this.consultantName = consultantName;
	}
	public String getBookingCode() {
		return bookingCode;
	}
	public void setBookingCode(String bookingCode) {
		this.bookingCode = bookingCode;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
    
    
	
}
