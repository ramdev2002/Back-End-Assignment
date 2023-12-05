package com.example.blogapi.controller;

import com.example.blogapi.entity.Category;
import com.example.blogapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category-api")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/save")
    public Category createCategory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }
}
