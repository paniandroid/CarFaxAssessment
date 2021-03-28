
package com.carfax.assignment.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Images {

    private String baseUrl;
    private List<String> large = new ArrayList<String>();
    private List<String> medium = new ArrayList<String>();
    private List<String> small = new ArrayList<String>();
    private FirstPhoto firstPhoto;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public List<String> getLarge() {
        return large;
    }

    public void setLarge(List<String> large) {
        this.large = large;
    }

    public List<String> getMedium() {
        return medium;
    }

    public void setMedium(List<String> medium) {
        this.medium = medium;
    }

    public List<String> getSmall() {
        return small;
    }

    public void setSmall(List<String> small) {
        this.small = small;
    }

    public FirstPhoto getFirstPhoto() {
        return firstPhoto;
    }

    public void setFirstPhoto(FirstPhoto firstPhoto) {
        this.firstPhoto = firstPhoto;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
