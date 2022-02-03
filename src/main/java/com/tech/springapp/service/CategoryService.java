package com.tech.springapp.service;

import com.tech.springapp.model.Category;


import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> getCategories();
    Optional<Category> getCategory(Long categoryId);

    Category createCategory(Category categoryObject);

    //Category createCategory(Category categoryObject);
    Category updateCategory(Long categoryId);
    Optional<Category> deleteCategory(Long categoryId);
    Category saveCategory(Category category);
}
