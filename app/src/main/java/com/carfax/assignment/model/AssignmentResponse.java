
package com.carfax.assignment.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssignmentResponse {

    private SearchArea searchArea;
    private Long totalListingCount;
    private Long enhancedCount;
    private Long backfillCount;
    private Long dealerNewCount;
    private Long dealerUsedCount;
    private Long page;
    private Long pageSize;
    private Long totalPageCount;
    private List<Listing> listings = new ArrayList<Listing>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public SearchArea getSearchArea() {
        return searchArea;
    }

    public void setSearchArea(SearchArea searchArea) {
        this.searchArea = searchArea;
    }

    public Long getTotalListingCount() {
        return totalListingCount;
    }

    public void setTotalListingCount(Long totalListingCount) {
        this.totalListingCount = totalListingCount;
    }

    public Long getEnhancedCount() {
        return enhancedCount;
    }

    public void setEnhancedCount(Long enhancedCount) {
        this.enhancedCount = enhancedCount;
    }

    public Long getBackfillCount() {
        return backfillCount;
    }

    public void setBackfillCount(Long backfillCount) {
        this.backfillCount = backfillCount;
    }

    public Long getDealerNewCount() {
        return dealerNewCount;
    }

    public void setDealerNewCount(Long dealerNewCount) {
        this.dealerNewCount = dealerNewCount;
    }

    public Long getDealerUsedCount() {
        return dealerUsedCount;
    }

    public void setDealerUsedCount(Long dealerUsedCount) {
        this.dealerUsedCount = dealerUsedCount;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(Long totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public List<Listing> getListings() {
        return listings;
    }

    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
