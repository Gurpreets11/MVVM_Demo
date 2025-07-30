package com.gurupect.mvvm_demo.model;

import java.io.Serializable;

public class BrandDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 5988086985360218331L;
    private Integer brandId;
    private String brandName;
    private String brandShortName;
    private String imageLocation;
    private String bestBrand;
    private String priority;


    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandShortName() {
        return brandShortName;
    }

    public void setBrandShortName(String brandShortName) {
        this.brandShortName = brandShortName;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public String getBestBrand() {
        return bestBrand;
    }

    public void setBestBrand(String bestBrand) {
        this.bestBrand = bestBrand;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
