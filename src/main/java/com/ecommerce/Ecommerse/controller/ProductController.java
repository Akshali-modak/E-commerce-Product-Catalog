package com.ecommerce.Ecommerse.controller;

import com.ecommerce.Ecommerse.entity.Category;
import com.ecommerce.Ecommerse.entity.Product;
import com.ecommerce.Ecommerse.service.CategoryService;
import com.ecommerce.Ecommerse.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/byCategory/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable Long categoryId) {
        // Retrieve Category by Id (you may want to add error handling if not found)


        // Get products for the specified category
        return productService.getProductsByCategory(categoryId);
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/remove/{productId}")
    public void removeProduct(@PathVariable Long productId) {
        productService.deleteProduct(productId);
    }

}
