package com.tech.springapp.controller;

import com.tech.springapp.model.Category;
import com.tech.springapp.model.dto.CategoryDto;
import com.tech.springapp.service.CategoryService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<CategoryDto> addCategory(@RequestBody final CategoryDto categoryDto) {
        Category category = categoryService.addCategory(Category.from(categoryDto));
        return new ResponseEntity<>(CategoryDto.from(category), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CategoryDto>> getCategories() {
        List<Category> categories = categoryService.getCategories();
        List<CategoryDto> categoriesDto = categories.stream().map(CategoryDto::from).collect(Collectors.toList());
        return new ResponseEntity<>(categoriesDto, HttpStatus.OK);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<CategoryDto> getCategory(@PathVariable final Long id) {
        Category category = categoryService.getCategory(id);
        return new ResponseEntity<>(CategoryDto.from(category), HttpStatus.OK);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<CategoryDto> deleteCategory(@PathVariable final Long id) {
        Category category = categoryService.deleteCategory(id);
        return new ResponseEntity<>(CategoryDto.from(category), HttpStatus.OK);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<CategoryDto> editCategory(@PathVariable final Long id,
                                                    @RequestBody final CategoryDto categoryDto) {
        Category category = categoryService.editCategory(id, Category.from(categoryDto));
        return new ResponseEntity<>(CategoryDto.from(category), HttpStatus.OK);
    }

    @PostMapping(value = "{categoryId}/resources/{resourceId}/add")
    public ResponseEntity<CategoryDto> addResourceToCategory(@PathVariable final Long categoryId,
                                                             @PathVariable final Long resourceId) {
        Category category = categoryService.addResourceToCategory(categoryId, resourceId);
        return new ResponseEntity<>(CategoryDto.from(category), HttpStatus.OK);
    }

    @DeleteMapping(value = "{categoryId}/resources/{resourceId}/add")
    public ResponseEntity<CategoryDto> removeResourceFromCategory(@PathVariable final Long categoryId,
                                                             @PathVariable final Long resourceId) {
        Category category = categoryService.removeResourceFromCategory(categoryId, resourceId);
        return new ResponseEntity<>(CategoryDto.from(category), HttpStatus.OK);
    }
}
