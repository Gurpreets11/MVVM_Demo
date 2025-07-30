package com.gurupect.mvvm_demo.model;

import java.io.Serializable;
import java.util.Set;


public class UserDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4002074924834751019L;
	
	
	private Integer userId;
	private String mobileNo;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String appVersion;
	private String appVersionUpdateOn;
	private String remarks;
	private Integer status;
	private Integer isMobileVerified;
	private Integer isEmailVerified;
	private String mobileVerifiedCode;
	private String emailVerifiedCode;
	private Integer isOtherApi;
	private String notificationRegId;
	private String referralCode;
	
	/** The created on. */
	private String createdOn;
	
	/** The created by. */
	private String createdBy;

	/** The modified on. */
	private String modifiedOn;
	
	/** The modified by. */
	private String modifiedBy;
    private String interfaces;
	
	private String ipAddress;
	
	private Integer userTypeId;
	private String userTypeName;
	private Set<UserDetailsDTO> userDetails;
	private String companyCode;
	private String plantCode;
	private String kyc;
	private String kycUpdatedDatetime;
	private Integer statusDataChanged;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getAppVersionUpdateOn() {
		return appVersionUpdateOn;
	}

	public void setAppVersionUpdateOn(String appVersionUpdateOn) {
		this.appVersionUpdateOn = appVersionUpdateOn;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(Integer userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getUserTypeName() {
		return userTypeName;
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}

	public Set<UserDetailsDTO> getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(Set<UserDetailsDTO> userDetails) {
		this.userDetails = userDetails;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public String getInterfaces() {
		return interfaces;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public Integer getIsMobileVerified() {
		return isMobileVerified;
	}

	public void setIsMobileVerified(Integer isMobileVerified) {
		this.isMobileVerified = isMobileVerified;
	}

	public Integer getIsEmailVerified() {
		return isEmailVerified;
	}

	public void setIsEmailVerified(Integer isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}

	public String getMobileVerifiedCode() {
		return mobileVerifiedCode;
	}

	public void setMobileVerifiedCode(String mobileVerifiedCode) {
		this.mobileVerifiedCode = mobileVerifiedCode;
	}

	public String getEmailVerifiedCode() {
		return emailVerifiedCode;
	}

	public void setEmailVerifiedCode(String emailVerifiedCode) {
		this.emailVerifiedCode = emailVerifiedCode;
	}

	public Integer getIsOtherApi() {
		return isOtherApi;
	}

	public void setIsOtherApi(Integer isOtherApi) {
		this.isOtherApi = isOtherApi;
	}

	public String getNotificationRegId() {
		return notificationRegId;
	}

	public void setNotificationRegId(String notificationRegId) {
		this.notificationRegId = notificationRegId;
	}

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}
	
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public void setInterfaces(String interfaces) {
		this.interfaces = interfaces;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getPlantCode() {
		return plantCode;
	}

	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
	}

	public String getKyc() {
		return kyc;
	}

	public void setKyc(String kyc) {
		this.kyc = kyc;
	}

	public String getKycUpdatedDatetime() {
		return kycUpdatedDatetime;
	}

	public void setKycUpdatedDatetime(String kycUpdatedDatetime) {
		this.kycUpdatedDatetime = kycUpdatedDatetime;
	}

	public Integer getStatusDataChanged() {
		return statusDataChanged;
	}

	public void setStatusDataChanged(Integer statusDataChanged) {
		this.statusDataChanged = statusDataChanged;
	}
}
