package com.tech.springapp.service;

import com.tech.springapp.model.Category;
import com.tech.springapp.model.Role;
import com.tech.springapp.model.User;

import java.util.List;

public interface CategoryService {
    Category saveCategory(Category category);
    Category getCategory(String name);
    List<Category> getAllCategories();
}
