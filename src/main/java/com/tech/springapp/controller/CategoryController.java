package com.tech.springapp.controller;

import com.tech.springapp.model.Category;
import com.tech.springapp.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;


    @GetMapping("/categories")
    public ResponseEntity<List<Category>>getCategories() {
        return ResponseEntity.ok().body(categoryService.getCategories());
    }

}
