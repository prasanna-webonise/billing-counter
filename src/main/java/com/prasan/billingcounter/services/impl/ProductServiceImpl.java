package com.prasan.billingcounter.services.impl;

import com.prasan.billingcounter.pojos.ProductDetailsResponse;
import com.prasan.billingcounter.pojos.ProductRequest;
import com.prasan.billingcounter.models.Category;
import com.prasan.billingcounter.models.Product;
import com.prasan.billingcounter.repositories.CategoryRepository;
import com.prasan.billingcounter.repositories.ProductRepository;
import com.prasan.billingcounter.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    @Autowired
    ProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product saveProduct(ProductRequest product) {
        Category category = categoryRepository.findCategoryByCategoryType(product.getCategoryType());
        return productRepository.save(new Product(0, product.getProductName(), product.getPrice(), category));
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductDetailsResponse getProductById(Integer productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        Product product;
        if (optionalProduct.isPresent()) {
            product = optionalProduct.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Incorrect Article code");
        }
        return new ProductDetailsResponse(product, product.getCategory());
    }

    @Override
    public List<Product> getProductsByCategory(String categoryType) {
        return productRepository.getProductsByCategoryCategoryType(categoryType);
    }
}
