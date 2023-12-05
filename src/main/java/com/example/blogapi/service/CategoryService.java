package com.example.blogapi.service;

import com.example.blogapi.entity.Category;
import com.example.blogapi.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;
    public Category saveCategory(Category category){
        return categoryRepo.save(category);
    }
}
