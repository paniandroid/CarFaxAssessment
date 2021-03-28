
package com.carfax.assignment.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchArea {

    private String city;
    private String state;
    private String zip;
    private Float latitude;
    private Float longitude;
    private Float radius;
    private Boolean dynamicRadius;
    private List<Float> dynamicRadii = new ArrayList<Float>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public Boolean getDynamicRadius() {
        return dynamicRadius;
    }

    public void setDynamicRadius(Boolean dynamicRadius) {
        this.dynamicRadius = dynamicRadius;
    }

    public List<Float> getDynamicRadii() {
        return dynamicRadii;
    }

    public void setDynamicRadii(List<Float> dynamicRadii) {
        this.dynamicRadii = dynamicRadii;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
