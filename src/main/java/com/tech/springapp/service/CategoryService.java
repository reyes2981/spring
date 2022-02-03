package com.tech.springapp.service;

import com.tech.springapp.model.Category;
import com.tech.springapp.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category addCategory(Category category) {
        return CategoryRepository.save(category);
    }
}
