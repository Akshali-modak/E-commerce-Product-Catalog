package com.ecommerce.Ecommerse.service;

import com.ecommerce.Ecommerse.entity.Category;
import com.ecommerce.Ecommerse.entity.Product;
import com.ecommerce.Ecommerse.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryService categoryService;
    public List<Product> getProductsByCategory(long categoryId) {
        Category category = categoryService.getCategoryById(categoryId);
        return productRepository.findByCategory(category);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }


    public String deleteProduct(Long id) {
        productRepository.deleteById(id);
        return "Product deleted successfully";
    }

    public Product updateProduct(Product product , Long productId ) {
        Product existingProduct = productRepository.findById(productId).orElse(null);
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
        }

        return productRepository.save(existingProduct);
    }
}
