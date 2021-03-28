
package com.carfax.assignment.model;

import java.util.HashMap;
import java.util.Map;

public class MonthlyPaymentEstimate {

    private Float price;
    private Float downPaymentPercent;
    private Float interestRate;
    private Long termInMonths;
    private Float loanAmount;
    private Float downPaymentAmount;
    private Float monthlyPayment;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getDownPaymentPercent() {
        return downPaymentPercent;
    }

    public void setDownPaymentPercent(Float downPaymentPercent) {
        this.downPaymentPercent = downPaymentPercent;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }

    public Long getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(Long termInMonths) {
        this.termInMonths = termInMonths;
    }

    public Float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Float getDownPaymentAmount() {
        return downPaymentAmount;
    }

    public void setDownPaymentAmount(Float downPaymentAmount) {
        this.downPaymentAmount = downPaymentAmount;
    }

    public Float getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(Float monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
