package com.ecommerce.Ecommerse.controller;

import com.ecommerce.Ecommerse.entity.Category;
import com.ecommerce.Ecommerse.entity.Product;
import com.ecommerce.Ecommerse.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/add")
    public String addCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

    @GetMapping("/{categoryId}")
    public Category getProductsByCategory(@PathVariable Long categoryId) {
        // Retrieve Category by Id (you may want to add error handling if not found)
        return categoryService.getCategoryById(categoryId);
    }

    @DeleteMapping("/remove/{categoryId}")
    public void removeCategory(@PathVariable Long categoryId) {
        categoryService.deleteCategory(categoryId);
    }

}
