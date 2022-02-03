package com.tech.springapp.service;

import com.tech.springapp.excception.CategoryNotFoundException;
import com.tech.springapp.model.Category;
import com.tech.springapp.model.Resource;
import com.tech.springapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final ResourceService resourceService;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository, ResourceService resourceService) {
        this.categoryRepository = categoryRepository;
        this.resourceService = resourceService;
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getCategories() {
        return StreamSupport
                .stream(categoryRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Category getCategory(Long id) {
        return categoryRepository.findById(id).orElseThrow(() ->
                new CategoryNotFoundException(id));
    }

    public Category deleteCategory(Long id) {
        Category category = getCategory(id);
        categoryRepository.delete(category);
        return category;
    }

    @Transactional
    public Category editCategory(Long id, Category category) {
        Category categoryToEdit = getCategory(id);
        categoryToEdit.setName(category.getName());
        return categoryToEdit;
    }

    @Transactional
    public Category addResourceToCategory(Long categoryId, Long resourceId) {
        Category category = getCategory(categoryId);
        Resource resource = resourceService.getResource(resourceId);
        category.addResource(resource);
        return category;
    }

    @Transactional
    public Category removeResourceFromCategory(Long categoryId, Long resourceId) {
        Category category = getCategory(categoryId);
        Resource resource = resourceService.getResource(resourceId);
        category.removeResource(resource);
        return category;
    }


}
