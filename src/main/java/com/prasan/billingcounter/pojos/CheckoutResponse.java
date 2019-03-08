package com.prasan.billingcounter.pojos;

import java.util.List;

public class CheckoutResponse {
    private List<InvoiceItemDetails> invoiceItems;
    private Double totalPrice;
    private Double totalTax;

    public List<InvoiceItemDetails> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<InvoiceItemDetails> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(Double totalTax) {
        this.totalTax = totalTax;
    }

    public CheckoutResponse(List<InvoiceItemDetails> invoiceItems, Double totalPrice, Double totalTax) {
        this.invoiceItems = invoiceItems;
        this.totalPrice = totalPrice;
        this.totalTax = totalTax;
    }
}
