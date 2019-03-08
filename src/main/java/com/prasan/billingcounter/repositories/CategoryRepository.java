package com.prasan.billingcounter.repositories;

import com.prasan.billingcounter.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findCategoryByCategoryType(String categoryType);
}
