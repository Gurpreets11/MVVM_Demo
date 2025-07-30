package com.gurupect.mvvm_demo.model;

import java.io.Serializable;

public class ColorDTO  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5988086985360218331L;
	private Integer colorId;
	private String colorCode;
	private String colorName;
	public Integer getColorId() {
		return colorId;
	}
	public void setColorId(Integer colorId) {
		this.colorId = colorId;
	}
	public String getColorCode() {
		return colorCode;
	}
	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}
	public String getColorName() {
		return colorName;
	}
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	
	
	

}
