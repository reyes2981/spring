package com.tech.springapp.service;


import com.tech.springapp.model.Category;
import com.tech.springapp.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CategoryServiceImplementation implements CategoryService {

    private final CategoryRepository categoryRepository;

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
        return categoryRepository.delete(categoryId);
    }

    @Override
    public Category saveCategory(Category category) {
        log.info("Saving a new user {} to the DB", category);
        return categoryRepository.save(category);
    }
}
