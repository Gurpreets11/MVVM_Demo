package com.gurupect.mvvm_demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ArticleParameterDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7405199763348336882L;
	private int articleId;
	private int parameterId;
	private String parentParameter;
	private String parameter;
	private String parameterValue;
	private int parentId;
	private String parameterType;
	private Integer status;
	private String articleCode;
	private String articleName;
	private String articleDesc;
	private Double exShowroomPrice;
    private Double rtoCharges;
	private Double insuranceCharges;
	private Double registrationCharge;
	private Double accessoriesCharges;
	private Double handlingCharges;
	private Double otherCharges;
	private Double onroadPrice;
	private String effectiveFrom;
	private String effectiveTo;
	private Double SGST;
	private Double CGST;
	private Double rating;
	private Double rate;
	private Double value;
	private Integer isExchangeOfferAvailable;
	private Double exchangeOfferAmount;
	private Integer userId;
	private String offerEeffectiveFrom;
	private String offerEeffectiveTo;
	
	private List<ParameterDetailsDTO> aListparameterDetails;
	
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public int getParameterId() {
		return parameterId;
	}
	public void setParameterId(int parameterId) {
		this.parameterId = parameterId;
	}
	public String getParentParameter() {
		return parentParameter;
	}
	public void setParentParameter(String parentParameter) {
		this.parentParameter = parentParameter;
	}
	public String getParameter() {
		return parameter;
	}
	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
	public String getParameterValue() {
		return parameterValue;
	}
	public void setParameterValue(String parameterValue) {
		this.parameterValue = parameterValue;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getParameterType() {
		return parameterType;
	}
	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
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
	public String getArticleDesc() {
		return articleDesc;
	}
	public void setArticleDesc(String articleDesc) {
		this.articleDesc = articleDesc;
	}
	public Double getExShowroomPrice() {
		return exShowroomPrice;
	}
	public void setExShowroomPrice(Double exShowroomPrice) {
		this.exShowroomPrice = exShowroomPrice;
	}
	public Double getRtoCharges() {
		return rtoCharges;
	}
	public void setRtoCharges(Double rtoCharges) {
		this.rtoCharges = rtoCharges;
	}
	public Double getInsuranceCharges() {
		return insuranceCharges;
	}
	public void setInsuranceCharges(Double insuranceCharges) {
		this.insuranceCharges = insuranceCharges;
	}
	public Double getRegistrationCharge() {
		return registrationCharge;
	}
	public void setRegistrationCharge(Double registrationCharge) {
		this.registrationCharge = registrationCharge;
	}
	public Double getAccessoriesCharges() {
		return accessoriesCharges;
	}
	public void setAccessoriesCharges(Double accessoriesCharges) {
		this.accessoriesCharges = accessoriesCharges;
	}
	public Double getHandlingCharges() {
		return handlingCharges;
	}
	public void setHandlingCharges(Double handlingCharges) {
		this.handlingCharges = handlingCharges;
	}
	public Double getOtherCharges() {
		return otherCharges;
	}
	public void setOtherCharges(Double otherCharges) {
		this.otherCharges = otherCharges;
	}
	public Double getOnroadPrice() {
		return onroadPrice;
	}
	public void setOnroadPrice(Double onroadPrice) {
		this.onroadPrice = onroadPrice;
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
	public Double getSGST() {
		return SGST;
	}
	public void setSGST(Double sGST) {
		SGST = sGST;
	}
	public Double getCGST() {
		return CGST;
	}
	public void setCGST(Double cGST) {
		CGST = cGST;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
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
	public String getOfferEeffectiveFrom() {
		return offerEeffectiveFrom;
	}
	public void setOfferEeffectiveFrom(String offerEeffectiveFrom) {
		this.offerEeffectiveFrom = offerEeffectiveFrom;
	}
	public String getOfferEeffectiveTo() {
		return offerEeffectiveTo;
	}
	public void setOfferEeffectiveTo(String offerEeffectiveTo) {
		this.offerEeffectiveTo = offerEeffectiveTo;
	}
	
	
	public boolean equals(Object obj){
		if(obj != null && obj instanceof ArticleParameterDTO && ((ArticleParameterDTO)obj).getParentId() != 0 && getParentId() != 0) {
			return (getParentId()==((ArticleParameterDTO)obj).getParentId());
		}
		return false;
	}
	
	public int hashCode() {
		if(parentId != 0) {
			return parentId;
		} else {
			return super.hashCode();
		}
	}
	
	public void addParameterDetails(ParameterDetailsDTO parameterDetails){
		if(aListparameterDetails == null){
			aListparameterDetails = new ArrayList<>();
		}
		aListparameterDetails.add(parameterDetails);
	}
	public List<ParameterDetailsDTO> getaListparameterDetails() {
		return aListparameterDetails;
	}
	public void setaListparameterDetails(List<ParameterDetailsDTO> aListparameterDetails) {
		this.aListparameterDetails = aListparameterDetails;
	}
	
	
}
