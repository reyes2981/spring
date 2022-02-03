package com.tech.springapp.service;

import com.tech.springapp.excception.CategoryNotFoundException;
import com.tech.springapp.model.Category;
import com.tech.springapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> GetCategories() {
        return StreamSupport
                .stream(categoryRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Category getCategory(Long id) {
      return categoryRepository.findById(id).orElseThrow( () ->
              new CategoryNotFoundException(id));
    }

    public Category deleteCategory(Long id) {
        Category category = getCategory(id);
        categoryRepository.delete(category);
        return category;

    }


}
