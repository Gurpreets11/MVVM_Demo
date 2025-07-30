package com.gurupect.mvvm_demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class POSArticleDTO implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = 7405199763348336882L;
    private Integer articleId;
    private String articleCode;
    private String articleName;
    private String articleDescription;
    private String uom;
    private Integer brandId;
    private Integer mcHierarchyId;
    private Integer subclassCode;
    private Integer classCode;
    private Integer departmentCode;
    private Integer groupCode;
    private Integer divisionCode;
    private Integer isFoc;
    private Integer isCatalog;
    private Integer internalImageCount;
    private Integer externalImageCount;
    private String imageLocation;
    private Integer status;
    private String color;
    private String priceRange;
    private Integer priority;
    private String remarks;
    private String brandName;
    private String brandImageLocation;
    private String divisionName;
    private String groupName;
    private String className;
    private String subclassName;
    private String departmentName;
    private List<ArticleParameterDTO> aListArticleParameterDTO;
    private String ids;
    private List<ColorDTO> aListColorDTO;
    private String barcode;
    private Double size;
    private String hsnCode;
    private Integer serialize;
    private BigDecimal mrp;
    private BigDecimal dp;
    private BigDecimal map;
    private BigDecimal soh;
    private BigDecimal inStock;
    private BigDecimal outStock;
    private BigDecimal saleable;
    private BigDecimal restricted;
    private BigDecimal min_qty;
    private Boolean isGreater;
    private Boolean isLess;
    private String companyCode;
    private String plantCode;
    private String availbilityStatus;
    private String shortDescription;
    private Integer vendorId;

    private List<TaxDTO> taxDetails;  //Changes in DTO
    private List<OfferDTO> offerDetails; //CHanges in DTO
    private Float totalTax; //CHanges in DTO
    private Float afterTaxSellingPrice; //CHanges in DTO
    private Integer inventoryId;

    private int availableOfferCount; //New CHanges in DTO
    private BigDecimal saveAmount;
    private int isDiscountAvailable;
    private BigDecimal discountedMap;
    private OfferDTO applicableOfferDetails;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
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

    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getMcHierarchyId() {
        return mcHierarchyId;
    }

    public void setMcHierarchyId(Integer mcHierarchyId) {
        this.mcHierarchyId = mcHierarchyId;
    }

    public Integer getSubclassCode() {
        return subclassCode;
    }

    public void setSubclassCode(Integer subclassCode) {
        this.subclassCode = subclassCode;
    }

    public Integer getClassCode() {
        return classCode;
    }

    public void setClassCode(Integer classCode) {
        this.classCode = classCode;
    }

    public Integer getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(Integer departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Integer getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(Integer groupCode) {
        this.groupCode = groupCode;
    }

    public Integer getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(Integer divisionCode) {
        this.divisionCode = divisionCode;
    }

    public Integer getIsFoc() {
        return isFoc;
    }

    public void setIsFoc(Integer isFoc) {
        this.isFoc = isFoc;
    }

    public Integer getIsCatalog() {
        return isCatalog;
    }

    public void setIsCatalog(Integer isCatalog) {
        this.isCatalog = isCatalog;
    }

    public Integer getInternalImageCount() {
        return internalImageCount;
    }

    public void setInternalImageCount(Integer internalImageCount) {
        this.internalImageCount = internalImageCount;
    }

    public Integer getExternalImageCount() {
        return externalImageCount;
    }

    public void setExternalImageCount(Integer externalImageCount) {
        this.externalImageCount = externalImageCount;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandImageLocation() {
        return brandImageLocation;
    }

    public void setBrandImageLocation(String brandImageLocation) {
        this.brandImageLocation = brandImageLocation;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubclassName() {
        return subclassName;
    }

    public void setSubclassName(String subclassName) {
        this.subclassName = subclassName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<ArticleParameterDTO> getaListArticleParameterDTO() {
        return aListArticleParameterDTO;
    }

    public void setaListArticleParameterDTO(List<ArticleParameterDTO> aListArticleParameterDTO) {
        this.aListArticleParameterDTO = aListArticleParameterDTO;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public List<ColorDTO> getaListColorDTO() {
        return aListColorDTO;
    }

    public void setaListColorDTO(List<ColorDTO> aListColorDTO) {
        this.aListColorDTO = aListColorDTO;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getHsnCode() {
        return hsnCode;
    }

    public void setHsnCode(String hsnCode) {
        this.hsnCode = hsnCode;
    }

    public int getSerialize() {
        return serialize;
    }

    public void setSerialize(int serialize) {
        this.serialize = serialize;
    }

    public BigDecimal getMrp() {
        return mrp;
    }

    public void setMrp(BigDecimal mrp) {
        this.mrp = mrp;
    }

    public BigDecimal getDp() {
        return dp;
    }

    public void setDp(BigDecimal dp) {
        this.dp = dp;
    }

    public BigDecimal getMap() {
        return map;
    }

    public void setMap(BigDecimal map) {
        this.map = map;
    }

    public BigDecimal getSoh() {
        return soh;
    }

    public void setSoh(BigDecimal soh) {
        this.soh = soh;
    }

    public BigDecimal getInStock() {
        return inStock;
    }

    public void setInStock(BigDecimal inStock) {
        this.inStock = inStock;
    }

    public BigDecimal getOutStock() {
        return outStock;
    }

    public void setOutStock(BigDecimal outStock) {
        this.outStock = outStock;
    }

    public BigDecimal getSaleable() {
        return saleable;
    }

    public void setSaleable(BigDecimal saleable) {
        this.saleable = saleable;
    }

    public BigDecimal getRestricted() {
        return restricted;
    }

    public void setRestricted(BigDecimal restricted) {
        this.restricted = restricted;
    }

    public BigDecimal getMin_qty() {
        return min_qty;
    }

    public void setMin_qty(BigDecimal min_qty) {
        this.min_qty = min_qty;
    }

    public Boolean getGreater() {
        return isGreater;
    }

    public void setGreater(Boolean greater) {
        isGreater = greater;
    }

    public Boolean getLess() {
        return isLess;
    }

    public void setLess(Boolean less) {
        isLess = less;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getPlantCode() {
        return plantCode;
    }

    public void setPlantCode(String plantCode) {
        this.plantCode = plantCode;
    }

    public String getAvailbilityStatus() {
        return availbilityStatus;
    }

    public void setAvailbilityStatus(String availbilityStatus) {
        this.availbilityStatus = availbilityStatus;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public List<TaxDTO> getTaxDetails() {
        return taxDetails;
    }

    public void setTaxDetails(List<TaxDTO> taxDetails) {
        this.taxDetails = taxDetails;
    }

    public List<OfferDTO> getOfferDetails() {
        return offerDetails;
    }

    public void setOfferDetails(List<OfferDTO> offerDetails) {
        this.offerDetails = offerDetails;
    }

    public Float getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(Float totalTax) {
        this.totalTax = totalTax;
    }

    public Float getAfterTaxSellingPrice() {
        return afterTaxSellingPrice;
    }

    public void setAfterTaxSellingPrice(Float afterTaxSellingPrice) {
        this.afterTaxSellingPrice = afterTaxSellingPrice;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getAvailableOfferCount() {
        return availableOfferCount;
    }

    public void setAvailableOfferCount(int availableOfferCount) {
        this.availableOfferCount = availableOfferCount;
    }

    public BigDecimal getSaveAmount() {
        return saveAmount;
    }

    public void setSaveAmount(BigDecimal saveAmount) {
        this.saveAmount = saveAmount;
    }

    public int getIsDiscountAvailable() {
        return isDiscountAvailable;
    }

    public void setIsDiscountAvailable(int isDiscountAvailable) {
        this.isDiscountAvailable = isDiscountAvailable;
    }

    public BigDecimal getDiscountedMap() {
        return discountedMap;
    }

    public void setDiscountedMap(BigDecimal discountedMap) {
        this.discountedMap = discountedMap;
    }

    public OfferDTO getApplicableOfferDetails() {
        return applicableOfferDetails;
    }

    public void setApplicableOfferDetails(OfferDTO applicableOfferDetails) {
        this.applicableOfferDetails = applicableOfferDetails;
    }
}



