package com.gurupect.mvvm_demo.model;

import java.io.Serializable;

public class TransactionTaxDetailsDTO implements Serializable {
	
	private int id; 
	private int transId; 
	private int transItemwiseDetailsId; 
	private String taxType;
	private String taxDescription;
	private String basePrice;
	private Double tax_percentage;
	private Double taxAmount;
	private Double cformStatus;
	private String serverDatetime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public int getTransItemwiseDetailsId() {
		return transItemwiseDetailsId;
	}
	public void setTransItemwiseDetailsId(int transItemwiseDetailsId) {
		this.transItemwiseDetailsId = transItemwiseDetailsId;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getTaxDescription() {
		return taxDescription;
	}
	public void setTaxDescription(String taxDescription) {
		this.taxDescription = taxDescription;
	}
	public String getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(String basePrice) {
		this.basePrice = basePrice;
	}
	public Double getTax_percentage() {
		return tax_percentage;
	}
	public void setTax_percentage(Double tax_percentage) {
		this.tax_percentage = tax_percentage;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public Double getCformStatus() {
		return cformStatus;
	}
	public void setCformStatus(Double cformStatus) {
		this.cformStatus = cformStatus;
	}
	public String getServerDatetime() {
		return serverDatetime;
	}
	public void setServerDatetime(String serverDatetime) {
		this.serverDatetime = serverDatetime;
	}	
}
