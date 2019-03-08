package com.prasan.billingcounter.controllers;

import com.prasan.billingcounter.pojos.ProductDetailsResponse;
import com.prasan.billingcounter.pojos.ProductRequest;
import com.prasan.billingcounter.models.Product;
import com.prasan.billingcounter.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping()
    Product saveProduct(@RequestBody ProductRequest product) {
        return productService.saveProduct(product);
    }

    @GetMapping
    List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/product/{productId}")
    ProductDetailsResponse getProductById(@PathVariable Integer productId) {
        return productService.getProductById(productId);
    }

    @GetMapping("/{categoryType}")
    List<Product> getProductsByCategory(@PathVariable String categoryType) {
        return productService.getProductsByCategory(categoryType);
    }
}
