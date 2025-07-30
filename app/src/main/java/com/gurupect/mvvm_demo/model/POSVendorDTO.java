package com.gurupect.mvvm_demo.model;

import java.io.Serializable;

public class POSVendorDTO implements Serializable {

	private int vendorId;
	private String vendorCode;
	private String vendorName;
	private String vendorEmail;
	private String vendorMobileNumber;
	private String latitude;
	private String logitude;
	private int status;
	private String plantCode;
	private String companyCode;

	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
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
	public String getVendorEmail() {
		return vendorEmail;
	}
	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}
	public String getVendorMobileNumber() {
		return vendorMobileNumber;
	}
	public void setVendorMobileNumber(String vendorMobileNumber) {
		this.vendorMobileNumber = vendorMobileNumber;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLogitude() {
		return logitude;
	}
	public void setLogitude(String logitude) {
		this.logitude = logitude;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getPlantCode() {
		return plantCode;
	}
	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
}
