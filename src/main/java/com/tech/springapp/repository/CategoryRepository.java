package com.tech.springapp.repository;

import com.tech.springapp.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String categoryName);
}
