package com.gurupect.mvvm_demo.model;

import java.io.Serializable;

public class TransactionTendorDTO implements Serializable {
	
	private int id; 
	private int transId; 
	private String tenderType;
	private String bankName;
	private String branch;
	private String transactionNumber;
	private String cardNumber;
	private String chequeNumber;
	private String payableTo;
	private String payableAt;
	private String chequeDate;
	private Double tenderAmount;
	private String serverDatetime;
	private Double paid_amount;
	private int status; 
	private String remarks;
	private Double refundableAmount; // Changes 07/08/2019

	private String getwayTransId; // Changes 13/10/2019
	private String getwayHaxcode; // Changes 13/10/2019
	private String getwaySignature; // Changes 13/10/2019

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
	public String getTenderType() {
		return tenderType;
	}
	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public String getPayableTo() {
		return payableTo;
	}
	public void setPayableTo(String payableTo) {
		this.payableTo = payableTo;
	}
	public String getPayableAt() {
		return payableAt;
	}
	public void setPayableAt(String payableAt) {
		this.payableAt = payableAt;
	}
	public String getChequeDate() {
		return chequeDate;
	}
	public void setChequeDate(String chequeDate) {
		this.chequeDate = chequeDate;
	}
	public Double getTenderAmount() {
		return tenderAmount;
	}
	public void setTenderAmount(Double tenderAmount) {
		this.tenderAmount = tenderAmount;
	}
	public String getServerDatetime() {
		return serverDatetime;
	}
	public void setServerDatetime(String serverDatetime) {
		this.serverDatetime = serverDatetime;
	}
	public Double getPaid_amount() {
		return paid_amount;
	}
	public void setPaid_amount(Double paid_amount) {
		this.paid_amount = paid_amount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Double getRefundableAmount() {
		return refundableAmount;
	}

	public void setRefundableAmount(Double refundableAmount) {
		this.refundableAmount = refundableAmount;
	}

	public String getGetwayTransId() {
		return getwayTransId;
	}

	public void setGetwayTransId(String getwayTransId) {
		this.getwayTransId = getwayTransId;
	}

	public String getGetwayHaxcode() {
		return getwayHaxcode;
	}

	public void setGetwayHaxcode(String getwayHaxcode) {
		this.getwayHaxcode = getwayHaxcode;
	}

	public String getGetwaySignature() {
		return getwaySignature;
	}

	public void setGetwaySignature(String getwaySignature) {
		this.getwaySignature = getwaySignature;
	}
}
