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
public class CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategories() {
        System.out.println("service calling getCategories ==>");
        return categoryRepository.findAll();
    }

    public Optional getCategory(Long categoryId) {
        System.out.println("service getCategory ==>");
        Optional category = categoryRepository.findById(categoryId);
        if (category.isPresent()) {
            return category;
        } else {
            throw new InformationNotFoundException("category with id " + categoryId + " not found");
        }
    }

    public Category createCategory(Category categoryObject) {
        System.out.println("service calling createCategory ==>");

        Category category = categoryRepository.findByName(categoryObject.getName());
        if (category != null) {
            throw new InformationExistException("category with name " + category.getName() + " already exists");
        } else {
            return categoryRepository.save(categoryObject);
        }
    }

    public Category updateCategory(Long categoryId, Category categoryObject) {
        System.out.println("service calling updateCategory ==>");
        Optional<Category> category = categoryRepository.findById(categoryId);
        if (category.isPresent()) {
            if (categoryObject.getName().equals(category.get().getName())) {
                System.out.println("Same");
                throw new InformationExistException("category " + category.get().getName() + " is already exists");
            } else {
                Category updateCategory = categoryRepository.findById(categoryId).get();
                updateCategory.setName(categoryObject.getName());
                return categoryRepository.save(updateCategory);
            }
        } else {
            throw new InformationNotFoundException("category with id " + categoryId + " not found");
        }
    }

    public Optional<Category> deleteCategory(Long categoryId) {
        System.out.println("service calling deleteCategory ==>");
        Optional<Category> category = categoryRepository.findById(categoryId);

        if (((Optional<?>) category).isPresent()) {
            categoryRepository.deleteById(categoryId);
            return category;
        } else {
            throw new InformationNotFoundException("category with id " + categoryId + " not found");
        }
    }
}
