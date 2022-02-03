package com.tech.springapp.controller;

import com.tech.springapp.model.Category;
import com.tech.springapp.model.User;
import com.tech.springapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping("/categories")
    public String getCategories() {
        return "getting all categories";
    }

}
