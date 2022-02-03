package com.tech.springapp.service;

import com.tech.springapp.excception.InformationExistException;
import com.tech.springapp.excception.InformationNotFoundException;
import com.tech.springapp.model.Category;
import com.tech.springapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImplementation implements CategoryService {


    @Override
    public CategoryRepository setCategoryRepository(CategoryRepository categoryRepository) {
        return null;
    }

    @Override
    public List<Category> getCategories() {
        return null;
    }

    @Override
    public Optional<Category> getCategory(Long categoryId) {
        return Optional.empty();
    }

    @Override
    public Category createCategory(Category categoryObject) {
        return null;
    }

    @Override
    public Category updateCategory(Long categoryId, Category categoryObject) {
        return null;
    }

    @Override
    public Optional<Category> deleteCategory(Long categoryId) {
        return Optional.empty();
    }
}
