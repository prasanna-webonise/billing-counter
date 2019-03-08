package com.prasan.billingcounter.repositories;

import com.prasan.billingcounter.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> getProductsByCategoryCategoryType(String categoryType);
}
