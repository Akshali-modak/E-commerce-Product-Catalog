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

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/byCategory/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable Long categoryId) {
        // Retrieve Category by Id (you may want to add error handling if not found)
        return productService.getProductsByCategory(categoryId);
    }


    @DeleteMapping("/remove/{productId}")
    public String removeProduct(@PathVariable Long productId) {
       return productService.deleteProduct(productId);
    }

    @PutMapping("/{productId}")
    public Product updateProduct(@RequestBody Product product , @PathVariable Long productId){
       return productService.updateProduct(product, productId);
    }

}
