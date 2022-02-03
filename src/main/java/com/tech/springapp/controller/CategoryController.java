package com.tech.springapp.controller;

import com.tech.springapp.model.Category;

import com.tech.springapp.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class CategoryController {

   private CategoryService categoryService;

   @GetMapping("/categories")
   public ResponseEntity<List<Category>>getCategories() {
      return ResponseEntity.ok().body(categoryService.getCategories());
   }

   @GetMapping(path = "/categories/{categoryId}")
   public Optional getCategory(@PathVariable Long categoryId) {
      System.out.println("calling getCategory ==>");
      return categoryService.getCategory(categoryId);
   }

   @PostMapping("/category/save")
   public ResponseEntity<Category> saveCategory(@RequestBody Category category) {
      URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/category/save").toUriString());
      return ResponseEntity.created(uri).body(categoryService.saveCategory(category));
   }

   @PutMapping("/categories/{categoryId}")
   public Category updateCategory(@PathVariable(value = "categoryId") Long categoryId, @RequestBody Category categoryObject) {
      System.out.println("calling updateCategory ==>");
      return categoryService.updateCategory(categoryId);
   }

   @DeleteMapping("/categories/{categoryId}")
   public Optional<Category> deleteCategory(@PathVariable(value = "categoryId") Long categoryId) {
      System.out.println("calling deleteCategory ==>");
      return categoryService.deleteCategory(categoryId);
   }
}
