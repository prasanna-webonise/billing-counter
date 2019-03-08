package com.prasan.billingcounter.services;

import com.prasan.billingcounter.pojos.ProductDetailsResponse;
import com.prasan.billingcounter.pojos.ProductRequest;
import com.prasan.billingcounter.models.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(ProductRequest product);

    List<Product> getAllProducts();

    ProductDetailsResponse getProductById(Integer productId);

    List<Product> getProductsByCategory(String categoryType);
}
