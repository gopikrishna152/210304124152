package com.gopikrishna.Online_assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gopikrishna.Online_assessment.Entity.Product;
import com.gopikrishna.Online_assessment.service.ProductService;
import java.util.List;
@RestController
public class ProductController {
	
	 @Autowired
	    private ProductService productService;
	    
	    @GetMapping("/categories/{category}/products")
	    public List<Product> getTopProducts(
	            @PathVariable String category,
	            @RequestParam int minPrice,
	            @RequestParam int maxPrice,
	            @RequestParam int n,
	            @RequestParam(required = false, defaultValue = "1") int page,
	            @RequestParam(required = false, defaultValue = "rating") String sort,
	            @RequestParam(required = false, defaultValue = "asc") String order) {
	        return productService.getTopProducts(category, minPrice, maxPrice, n, page, sort, order);
	    }
	    
	    @GetMapping("/categories/{category}/products/{productId}")
	    public Product getProductDetails(@PathVariable String category, @PathVariable String productId) {
	        return productService.getProductDetails(productId);
	    }
	
	
}
