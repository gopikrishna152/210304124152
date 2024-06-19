package com.gopikrishna.Online_assessment.service;

import java.util.List;

import com.gopikrishna.Online_assessment.Entity.Product;

public interface ProductService {
	 List<Product> getTopProducts(String category, int minPrice, int maxPrice, int n, int page, String sort, String order);
	    Product getProductDetails(String productId);
}
