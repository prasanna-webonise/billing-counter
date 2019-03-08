package com.prasan.billingcounter.pojos;

import com.prasan.billingcounter.models.Category;
import com.prasan.billingcounter.models.Product;

public class ProductDetailsResponse {
    private Product product;
    private Category category;

    public ProductDetailsResponse(Product product, Category category) {
        this.product = product;
        this.category = category;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
