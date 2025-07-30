package com.gurupect.mvvm_demo.model;

import java.io.Serializable;

public class ParameterDetailsDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7405199763348336882L;
	
	private Integer parameterId;
	private String parameterDisplayName;
	private String parentParameter;
	private String parameter;
	private String parameterValue;
	private String parameterType;
	private Double price;
	private Double inspectionCharges;
	private int inspectionRequired;
	private Integer status;
	
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
	public String getParameterType() {
		return parameterType;
	}
	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getParameterId() {
		return parameterId;
	}
	public void setParameterId(Integer parameterId) {
		this.parameterId = parameterId;
	}
	public String getParameterDisplayName() {
		return parameterDisplayName;
	}
	public void setParameterDisplayName(String parameterDisplayName) {
		this.parameterDisplayName = parameterDisplayName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getInspectionCharges() {
		return inspectionCharges;
	}
	public void setInspectionCharges(Double inspectionCharges) {
		this.inspectionCharges = inspectionCharges;
	}
	public int getInspectionRequired() {
		return inspectionRequired;
	}
	public void setInspectionRequired(int inspectionRequired) {
		this.inspectionRequired = inspectionRequired;
	}
	
	
	
}
