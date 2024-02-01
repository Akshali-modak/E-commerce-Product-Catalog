package com.ecommerce.Ecommerse.service;

import com.ecommerce.Ecommerse.entity.Category;
import com.ecommerce.Ecommerse.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public String saveCategory(Category category) {
         categoryRepository.save(category);
         return "Category inserted Successfully";
    }

    public Category getCategoryById(Long categoryId)
    {
        return categoryRepository.findById(categoryId).orElse(null);
    }

    public void deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }

}
