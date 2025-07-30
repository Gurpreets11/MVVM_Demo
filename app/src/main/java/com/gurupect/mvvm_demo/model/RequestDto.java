package com.gurupect.mvvm_demo.model;

import java.io.Serializable;
import java.util.List;


public class RequestDto implements Serializable {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = -944307956036879485L;

    private String imei;
    private Integer userId;
    private String loginType;
    private String userName;
    private String userCode;
    private String password;
    private String oldPassword;
    private String appVersion;
    private Integer userTypeId;
    private String dateFrom;
    private String DateTo;
    private String notificationRegId;
    private UserDTO mappedObject;
    private FeedbackDTO feedbackDTO;
    private String articleName;
    private List<String> requestedModule;
    private Integer id;
    private String priority;
    private Integer groupCode;
    private String groupName;
    private String brandName;
    private POSArticleDTO articleDTO;
    private Boolean isParameter;
    private Integer lowerLimit;
    private Integer higerLimit;
    private String articleCode;
    private Boolean isGroup;
    private String ids;
    private Integer stateId;

    private String state;
    private Integer cityId;
    private String city;
    private Boolean isConsultant;
    private String type;
    private Double latitude;
    private Double longitude;
    private Integer vendorId;
    private Integer serviceId;
    private String dealsIn;
    private String vechicleServicesName;
    private String userTypeName;
    private String bookingCode;
    private Integer parameterId;
    private String agencyName;
    private Boolean isPrice;
    private String orderAs;
    private String departmentName;
    private Integer departmentCode;
    private Boolean isdepartment;
    private String bookingStatus;
    private Boolean isId;
    private String remarks;
    private String emailId;
    // private PickAndDropDetailsDTO pickAndDropDetailsDTO;
    private String status;
    private Integer divisionCode;
    private String divisionName;
    private Integer classCode;
    private String className;
    private Integer subclassCode;
    private String subclassName;
    private String bannerType;
    private Boolean isDivision;
    private Boolean isClass;
    private Boolean isSubclass;
    private POSVendorDTO vendorDTO;
    private Integer statusDataChange;
    private POSOrderDTO posOrderDTO;
    private BrandDTO brandDTO;
    private Double minPrice;
    private Double maxPrice;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return DateTo;
    }

    public void setDateTo(String dateTo) {
        DateTo = dateTo;
    }

    public String getNotificationRegId() {
        return notificationRegId;
    }

    public void setNotificationRegId(String notificationRegId) {
        this.notificationRegId = notificationRegId;
    }

    public UserDTO getMappedObject() {
        return mappedObject;
    }

    public void setMappedObject(UserDTO mappedObject) {
        this.mappedObject = mappedObject;
    }

      public FeedbackDTO getFeedbackDTO() {
        return feedbackDTO;
    }

    public void setFeedbackDTO(FeedbackDTO feedbackDTO) {
        this.feedbackDTO = feedbackDTO;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public List<String> getRequestedModule() {
        return requestedModule;
    }

    public void setRequestedModule(List<String> requestedModule) {
        this.requestedModule = requestedModule;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Integer getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(Integer groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public POSArticleDTO getArticleDTO() {
        return articleDTO;
    }

    public void setArticleDTO(POSArticleDTO articleDTO) {
        this.articleDTO = articleDTO;
    }

    public Boolean getIsParameter() {
        return isParameter;
    }

    public void setIsParameter(Boolean isParameter) {
        this.isParameter = isParameter;
    }

    public Integer getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(Integer lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public Integer getHigerLimit() {
        return higerLimit;
    }

    public void setHigerLimit(Integer higerLimit) {
        this.higerLimit = higerLimit;
    }

    public String getArticleCode() {
        return articleCode;
    }

    public void setArticleCode(String articleCode) {
        this.articleCode = articleCode;
    }

    public Boolean getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Boolean isGroup) {
        this.isGroup = isGroup;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getIsConsultant() {
        return isConsultant;
    }

    public void setIsConsultant(Boolean isConsultant) {
        this.isConsultant = isConsultant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getDealsIn() {
        return dealsIn;
    }

    public void setDealsIn(String dealsIn) {
        this.dealsIn = dealsIn;
    }

    public String getVechicleServicesName() {
        return vechicleServicesName;
    }

    public void setVechicleServicesName(String vechicleServicesName) {
        this.vechicleServicesName = vechicleServicesName;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public Boolean getIsPrice() {
        return isPrice;
    }

    public void setIsPrice(Boolean isPrice) {
        this.isPrice = isPrice;
    }

    public String getOrderAs() {
        return orderAs;
    }

    public void setOrderAs(String orderAs) {
        this.orderAs = orderAs;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(Integer departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Boolean getIsdepartment() {
        return isdepartment;
    }

    public void setIsdepartment(Boolean isdepartment) {
        this.isdepartment = isdepartment;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Boolean getIsId() {
        return isId;
    }

    public void setIsId(Boolean isId) {
        this.isId = isId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    /*public PickAndDropDetailsDTO getPickAndDropDetailsDTO() {
        return pickAndDropDetailsDTO;
    }
    public void setPickAndDropDetailsDTO(PickAndDropDetailsDTO pickAndDropDetailsDTO) {
        this.pickAndDropDetailsDTO = pickAndDropDetailsDTO;
    }*/
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(Integer divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public Integer getClassCode() {
        return classCode;
    }

    public void setClassCode(Integer classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getSubclassCode() {
        return subclassCode;
    }

    public void setSubclassCode(Integer subclassCode) {
        this.subclassCode = subclassCode;
    }

    public String getSubclassName() {
        return subclassName;
    }

    public void setSubclassName(String subclassName) {
        this.subclassName = subclassName;
    }

    public String getBannerType() {
        return bannerType;
    }

    public void setBannerType(String bannerType) {
        this.bannerType = bannerType;
    }

    public Boolean getIsDivision() {
        return isDivision;
    }

    public void setIsDivision(Boolean isDivision) {
        this.isDivision = isDivision;
    }

    public Boolean getIsClass() {
        return isClass;
    }

    public void setIsClass(Boolean isClass) {
        this.isClass = isClass;
    }

    public Boolean getIsSubclass() {
        return isSubclass;
    }

    public void setIsSubclass(Boolean isSubclass) {
        this.isSubclass = isSubclass;
    }

    public POSVendorDTO getVendorDTO() {
        return vendorDTO;
    }

    public void setVendorDTO(POSVendorDTO vendorDTO) {
        this.vendorDTO = vendorDTO;
    }

    public int getStatusDataChange() {
        return statusDataChange;
    }

    public void setStatusDataChange(int statusDataChange) {
        this.statusDataChange = statusDataChange;
    }

    public POSOrderDTO getPosOrderDTO() {
        return posOrderDTO;
    }

    public void setPosOrderDTO(POSOrderDTO posOrderDTO) {
        this.posOrderDTO = posOrderDTO;
    }

    public BrandDTO getBrandDTO() {
        return brandDTO;
    }

    public void setBrandDTO(BrandDTO brandDTO) {
        this.brandDTO = brandDTO;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public String toString() {
        return "RequestDto{" +
                "imei='" + imei + '\'' +
                ", userId=" + userId +
                ", loginType='" + loginType + '\'' +
                ", userName='" + userName + '\'' +
                ", userCode='" + userCode + '\'' +
                ", password='" + password + '\'' +
                ", oldPassword='" + oldPassword + '\'' +
                ", appVersion='" + appVersion + '\'' +
                ", userTypeId=" + userTypeId +
                ", dateFrom='" + dateFrom + '\'' +
                ", DateTo='" + DateTo + '\'' +
                ", notificationRegId='" + notificationRegId + '\'' +
                ", mappedObject=" + mappedObject +
                ", feedbackDTO=" + feedbackDTO +
                ", articleName='" + articleName + '\'' +
                ", requestedModule=" + requestedModule +
                ", id=" + id +
                ", priority='" + priority + '\'' +
                ", groupCode=" + groupCode +
                ", groupName='" + groupName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", articleDTO=" + articleDTO +
                ", isParameter=" + isParameter +
                ", lowerLimit=" + lowerLimit +
                ", higerLimit=" + higerLimit +
                ", articleCode='" + articleCode + '\'' +
                ", isGroup=" + isGroup +
                ", ids='" + ids + '\'' +
                ", stateId=" + stateId +
                ", state='" + state + '\'' +
                ", cityId=" + cityId +
                ", city='" + city + '\'' +
                ", isConsultant=" + isConsultant +
                ", type='" + type + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", vendorId=" + vendorId +
                ", serviceId=" + serviceId +
                ", dealsIn='" + dealsIn + '\'' +
                ", vechicleServicesName='" + vechicleServicesName + '\'' +
                ", userTypeName='" + userTypeName + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", parameterId=" + parameterId +
                ", agencyName='" + agencyName + '\'' +
                ", isPrice=" + isPrice +
                ", orderAs='" + orderAs + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentCode=" + departmentCode +
                ", isdepartment=" + isdepartment +
                ", bookingStatus='" + bookingStatus + '\'' +
                ", isId=" + isId +
                ", remarks='" + remarks + '\'' +
                ", emailId='" + emailId + '\'' +
                ", status='" + status + '\'' +
                ", divisionCode=" + divisionCode +
                ", divisionName='" + divisionName + '\'' +
                ", classCode=" + classCode +
                ", className='" + className + '\'' +
                ", subclassCode=" + subclassCode +
                ", subclassName='" + subclassName + '\'' +
                ", bannerType='" + bannerType + '\'' +
                ", isDivision=" + isDivision +
                ", isClass=" + isClass +
                ", isSubclass=" + isSubclass +
                ", vendorDTO=" + vendorDTO +
                ", statusDataChange=" + statusDataChange +
                ", posOrderDTO=" + posOrderDTO +
                ", brandDTO=" + brandDTO +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                '}';
    }
}
