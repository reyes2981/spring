package com.tech.springapp.service;

import com.tech.springapp.model.Category;
import com.tech.springapp.model.User;
import com.tech.springapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImplementation implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategory(String name) {
        return categoryRepository.findByName(name);
    }


    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }


}
