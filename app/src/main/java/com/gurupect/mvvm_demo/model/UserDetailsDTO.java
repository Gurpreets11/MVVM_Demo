package com.gurupect.mvvm_demo.model;


import java.io.Serializable;

public class UserDetailsDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1988642537754467676L;
	private Integer userDetailsId;
	private String name;
	private String addressType;
	private String addressTypeNickName;
	private String address1;
	private String address2;
	private String landmarks;
	private Long pincode;
	private String contactNo;
	private Integer stateId;
	private Integer cityId;
	private String remarks;
	private Integer status;
	private String cityName;
	private String stateName;
	
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
	

	public Integer getUserDetailsId() {
		return userDetailsId;
	}

	public void setUserDetailsId(Integer userDetailsId) {
		this.userDetailsId = userDetailsId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressTypeNickName() {
		return addressTypeNickName;
	}

	public void setAddressTypeNickName(String addressTypeNickName) {
		this.addressTypeNickName = addressTypeNickName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getLandmarks() {
		return landmarks;
	}

	public void setLandmarks(String landmarks) {
		this.landmarks = landmarks;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
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

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
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
}