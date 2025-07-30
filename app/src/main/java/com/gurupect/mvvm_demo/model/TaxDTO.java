package com.gurupect.mvvm_demo.model;

import java.io.Serializable;


public class TaxDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1669360848120460956L;

	private Integer taxId;
	private String taxCode;
	private String taxName;
	private String hsnCode;
	private String taxDescription;
	private Integer cform_status;
	private String taxShortName;
	private Double rate;
	private Double value;
	private String taxOn;
	private Integer stateId;
	private Integer cityId;
	private String effectiveFrom;
	private String effectiveTo;
	private Float taxableAmount;

	public Integer getTaxId() {
		return taxId;
	}
	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}
	public String getTaxName() {
		return taxName;
	}
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}
	public String getTaxShortName() {
		return taxShortName;
	}
	public void setTaxShortName(String taxShortName) {
		this.taxShortName = taxShortName;
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
	public String getTaxOn() {
		return taxOn;
	}
	public void setTaxOn(String taxOn) {
		this.taxOn = taxOn;
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
	public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	public String getHsnCode() {
		return hsnCode;
	}
	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}
	public String getTaxDescription() {
		return taxDescription;
	}
	public void setTaxDescription(String taxDescription) {
		this.taxDescription = taxDescription;
	}
	public Integer getCform_status() {
		return cform_status;
	}
	public void setCform_status(Integer cform_status) {
		this.cform_status = cform_status;
	}
	public Float getTaxableAmount() {
		return taxableAmount;
	}
	public void setTaxableAmount(Float taxableAmount) {
		this.taxableAmount = taxableAmount;
	}
}
