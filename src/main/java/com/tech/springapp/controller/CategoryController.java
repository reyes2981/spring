package com.tech.springapp.controller;

import com.tech.springapp.model.Category;
import com.tech.springapp.repository.CategoryRepository;
import com.tech.springapp.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class CategoryController {

   private CategoryService categoryService;


}
