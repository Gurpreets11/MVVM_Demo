package com.gurupect.mvvm_demo.model;

import java.io.Serializable;
import java.util.List;

public class TransactionDTO implements Serializable {

	private int transId;
	private String invoiceNumber;
	private String invoiceDate;
	//BILLING OR RETURN OR SOB
	private String transType;
	private String transStartDateTime;
	private String transFinishDateTime;
	private String invoiceCreationDatetime;
	private String serverDatetime;
	private String latitude;
	private String longitude;
	// COMPLETE IN-COMPLETE RETURN CANCEL PARTIAL-RETURN
	private String transStatus;
	private float stockQuantity;
	private UserDTO userDTO;
	private List<TransactionDetailsDTO> transactionDetailsList;
	private List<TransactionOfferDetailsDTO> transactionOfferDetailsList;
	private List<TransactionTendorDTO> transactionTendorList;

	private String remarks;
	private int status;
	private String isSipplingRequired;
	private String isOfferApplied;
	private String agent;



	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getTransStartDateTime() {
		return transStartDateTime;
	}
	public void setTransStartDateTime(String transStartDateTime) {
		this.transStartDateTime = transStartDateTime;
	}
	public String getTransFinishDateTime() {
		return transFinishDateTime;
	}
	public void setTransFinishDateTime(String transFinishDateTime) {
		this.transFinishDateTime = transFinishDateTime;
	}
	public String getInvoiceCreationDatetime() {
		return invoiceCreationDatetime;
	}
	public void setInvoiceCreationDatetime(String invoiceCreationDatetime) {
		this.invoiceCreationDatetime = invoiceCreationDatetime;
	}
	public String getServerDatetime() {
		return serverDatetime;
	}
	public void setServerDatetime(String serverDatetime) {
		this.serverDatetime = serverDatetime;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getTransStatus() {
		return transStatus;
	}
	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}
	public float getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(float stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public UserDTO getUserDTO() {
		return userDTO;
	}
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	public List<TransactionDetailsDTO> getTransactionDetailsList() {
		return transactionDetailsList;
	}
	public void setTransactionDetailsList(List<TransactionDetailsDTO> transactionDetailsList) {
		this.transactionDetailsList = transactionDetailsList;
	}
	public List<TransactionOfferDetailsDTO> getTransactionOfferDetailsList() {
		return transactionOfferDetailsList;
	}
	public void setTransactionOfferDetailsList(List<TransactionOfferDetailsDTO> transactionOfferDetailsList) {
		this.transactionOfferDetailsList = transactionOfferDetailsList;
	}
	public List<TransactionTendorDTO> getTransactionTendorList() {
		return transactionTendorList;
	}
	public void setTransactionTendorList(List<TransactionTendorDTO> transactionTendorList) {
		this.transactionTendorList = transactionTendorList;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getIsSipplingRequired() {
		return isSipplingRequired;
	}

	public void setIsSipplingRequired(String isSipplingRequired) {
		this.isSipplingRequired = isSipplingRequired;
	}

	public String getIsOfferApplied() {
		return isOfferApplied;
	}

	public void setIsOfferApplied(String isOfferApplied) {
		this.isOfferApplied = isOfferApplied;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}


	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}
}
