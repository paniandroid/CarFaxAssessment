
package com.carfax.assignment.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Listing {
    private Dealer dealer;
    private String id;
    private String vin;
    private Long year;
    private String make;
    private String model;
    private String trim;
    private String subTrim;
    private List<String> topOptions = new ArrayList<String>();
    private Long mileage;
    private Float listPrice;
    private Float currentPrice;
    private MonthlyPaymentEstimate monthlyPaymentEstimate;
    private Float onePrice;
    private String badge;
    private String exteriorColor;
    private String interiorColor;
    private String engine;
    private String displacement;
    private String drivetype;
    private String transmission;
    private String fuel;
    private Long mpgCity;
    private Long mpgHighway;
    private String bodytype;
    private String vehicleCondition;
    private String cabType;
    private String bedLength;
    private Long followCount;
    private String stockNumber;
    private Long imageCount;
    private Images images;
    private String firstSeen;
    private Boolean oneOwner;
    private Boolean noAccidents;
    private Boolean serviceRecords;
    private Boolean personalUse;
    private Float distanceToDealer;
    private Boolean hasViewed;
    private Boolean sentLead;
    private Object sentLeadAt;
    private String recordType;
    private String dealerType;
    private Boolean backfill;
    private Boolean advantage;
    private String vdpUrl;
    private Float sortScore;
    private Boolean isEnriched;
    private Boolean following;
    private Boolean onlineOnly;
    private Boolean certified;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getSubTrim() {
        return subTrim;
    }

    public void setSubTrim(String subTrim) {
        this.subTrim = subTrim;
    }

    public List<String> getTopOptions() {
        return topOptions;
    }

    public void setTopOptions(List<String> topOptions) {
        this.topOptions = topOptions;
    }

    public Long getMileage() {
        return mileage;
    }

    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    public Float getListPrice() {
        return listPrice;
    }

    public void setListPrice(Float listPrice) {
        this.listPrice = listPrice;
    }

    public Float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public MonthlyPaymentEstimate getMonthlyPaymentEstimate() {
        return monthlyPaymentEstimate;
    }

    public void setMonthlyPaymentEstimate(MonthlyPaymentEstimate monthlyPaymentEstimate) {
        this.monthlyPaymentEstimate = monthlyPaymentEstimate;
    }

    public Float getOnePrice() {
        return onePrice;
    }

    public void setOnePrice(Float onePrice) {
        this.onePrice = onePrice;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getDrivetype() {
        return drivetype;
    }

    public void setDrivetype(String drivetype) {
        this.drivetype = drivetype;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Long getMpgCity() {
        return mpgCity;
    }

    public void setMpgCity(Long mpgCity) {
        this.mpgCity = mpgCity;
    }

    public Long getMpgHighway() {
        return mpgHighway;
    }

    public void setMpgHighway(Long mpgHighway) {
        this.mpgHighway = mpgHighway;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public String getVehicleCondition() {
        return vehicleCondition;
    }

    public void setVehicleCondition(String vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }

    public String getBedLength() {
        return bedLength;
    }

    public void setBedLength(String bedLength) {
        this.bedLength = bedLength;
    }

    public Long getFollowCount() {
        return followCount;
    }

    public void setFollowCount(Long followCount) {
        this.followCount = followCount;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public Long getImageCount() {
        return imageCount;
    }

    public void setImageCount(Long imageCount) {
        this.imageCount = imageCount;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(String firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Boolean getOneOwner() {
        return oneOwner;
    }

    public void setOneOwner(Boolean oneOwner) {
        this.oneOwner = oneOwner;
    }

    public Boolean getNoAccidents() {
        return noAccidents;
    }

    public void setNoAccidents(Boolean noAccidents) {
        this.noAccidents = noAccidents;
    }

    public Boolean getServiceRecords() {
        return serviceRecords;
    }

    public void setServiceRecords(Boolean serviceRecords) {
        this.serviceRecords = serviceRecords;
    }

    public Boolean getPersonalUse() {
        return personalUse;
    }

    public void setPersonalUse(Boolean personalUse) {
        this.personalUse = personalUse;
    }

    public Float getDistanceToDealer() {
        return distanceToDealer;
    }

    public void setDistanceToDealer(Float distanceToDealer) {
        this.distanceToDealer = distanceToDealer;
    }

    public Boolean getHasViewed() {
        return hasViewed;
    }

    public void setHasViewed(Boolean hasViewed) {
        this.hasViewed = hasViewed;
    }

    public Boolean getSentLead() {
        return sentLead;
    }

    public void setSentLead(Boolean sentLead) {
        this.sentLead = sentLead;
    }

    public Object getSentLeadAt() {
        return sentLeadAt;
    }

    public void setSentLeadAt(Object sentLeadAt) {
        this.sentLeadAt = sentLeadAt;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getDealerType() {
        return dealerType;
    }

    public void setDealerType(String dealerType) {
        this.dealerType = dealerType;
    }

    public Boolean getBackfill() {
        return backfill;
    }

    public void setBackfill(Boolean backfill) {
        this.backfill = backfill;
    }

    public Boolean getAdvantage() {
        return advantage;
    }

    public void setAdvantage(Boolean advantage) {
        this.advantage = advantage;
    }

    public String getVdpUrl() {
        return vdpUrl;
    }

    public void setVdpUrl(String vdpUrl) {
        this.vdpUrl = vdpUrl;
    }

    public Float getSortScore() {
        return sortScore;
    }

    public void setSortScore(Float sortScore) {
        this.sortScore = sortScore;
    }

    public Boolean getIsEnriched() {
        return isEnriched;
    }

    public void setIsEnriched(Boolean isEnriched) {
        this.isEnriched = isEnriched;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public Boolean getOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(Boolean onlineOnly) {
        this.onlineOnly = onlineOnly;
    }

    public Boolean getCertified() {
        return certified;
    }

    public void setCertified(Boolean certified) {
        this.certified = certified;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
