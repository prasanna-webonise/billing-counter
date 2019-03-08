package com.prasan.billingcounter.pojos;

public class InvoiceItemDetails {
    private String productName;
    private Integer quantity;
    private float unitPrice;
    private float totalPrice;
    private float taxLevied;
    private float totalTax;

    public InvoiceItemDetails(String category, Integer quantity, float unitPrice, float totalPrice, float taxLevied, float totalTax) {
        this.productName = category;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.taxLevied = taxLevied;
        this.totalTax = totalTax;
    }

    public InvoiceItemDetails() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public float getTaxLevied() {
        return taxLevied;
    }

    public void setTaxLevied(float taxLevied) {
        this.taxLevied = taxLevied;
    }

    public float getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(float totalTax) {
        this.totalTax = totalTax;
    }
}
