package com.tech.springapp.service;

import com.tech.springapp.model.Category;
import com.tech.springapp.model.Role;
import com.tech.springapp.model.User;
import com.tech.springapp.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    CategoryRepository setCategoryRepository(CategoryRepository categoryRepository);
    List<Category> getCategories();
    Optional<Category> getCategory(Long categoryId);
    Category createCategory(Category categoryObject);
    Category updateCategory(Long categoryId, Category categoryObject);
    Optional<Category> deleteCategory(Long categoryId);


}
