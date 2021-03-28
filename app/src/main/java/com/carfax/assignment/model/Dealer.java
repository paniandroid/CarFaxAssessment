
package com.carfax.assignment.model;

import java.util.HashMap;
import java.util.Map;

public class Dealer {

    private String carfaxId;
    private String dealerInventoryUrl;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String latitude;
    private String longitude;
    private Float dealerAverageRating;
    private String dealerReviewDate;
    private String dealerReviewReviewer;
    private Long dealerReviewRating;
    private Long dealerReviewCount;
    private Boolean onlineOnly;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCarfaxId() {
        return carfaxId;
    }

    public void setCarfaxId(String carfaxId) {
        this.carfaxId = carfaxId;
    }

    public String getDealerInventoryUrl() {
        return dealerInventoryUrl;
    }

    public void setDealerInventoryUrl(String dealerInventoryUrl) {
        this.dealerInventoryUrl = dealerInventoryUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Float getDealerAverageRating() {
        return dealerAverageRating;
    }

    public void setDealerAverageRating(Float dealerAverageRating) {
        this.dealerAverageRating = dealerAverageRating;
    }

    public String getDealerReviewDate() {
        return dealerReviewDate;
    }

    public void setDealerReviewDate(String dealerReviewDate) {
        this.dealerReviewDate = dealerReviewDate;
    }

    public String getDealerReviewReviewer() {
        return dealerReviewReviewer;
    }

    public void setDealerReviewReviewer(String dealerReviewReviewer) {
        this.dealerReviewReviewer = dealerReviewReviewer;
    }

    public Long getDealerReviewRating() {
        return dealerReviewRating;
    }

    public void setDealerReviewRating(Long dealerReviewRating) {
        this.dealerReviewRating = dealerReviewRating;
    }

    public Long getDealerReviewCount() {
        return dealerReviewCount;
    }

    public void setDealerReviewCount(Long dealerReviewCount) {
        this.dealerReviewCount = dealerReviewCount;
    }

    public Boolean getOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(Boolean onlineOnly) {
        this.onlineOnly = onlineOnly;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
