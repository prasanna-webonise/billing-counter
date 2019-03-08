package com.prasan.billingcounter.pojos;

import java.util.List;

public class CheckoutRequest {
    private String customerName;
    private Long mobileNumber;
    private List<ProductEntries> productEntriesList;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<ProductEntries> getProductEntriesList() {
        return productEntriesList;
    }

    public void setProductEntriesList(List<ProductEntries> productEntriesList) {
        this.productEntriesList = productEntriesList;
    }
}
