package com.ecommerce.Ecommerse.controller;

import com.ecommerce.Ecommerse.entity.Category;
import com.ecommerce.Ecommerse.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/add")
    public Category addCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }





    // Other endpoints as needed
}
