package com.gopikrishna.Online_assessment.serviceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.gopikrishna.Online_assessment.Entity.Product;
import com.gopikrishna.Online_assessment.service.ProductService;

import reactor.core.publisher.Mono;
@Service
public class ProductServiceImpl implements ProductService{
	
	 private final WebClient webClient;

	    @Value("${api.auth.token}")
	    private String authToken; // Inject the authorization token from application.properties

	    public ProductServiceImpl(WebClient.Builder webClientBuilder) {
	        this.webClient = webClientBuilder.baseUrl("http://28.244.56.144/test").build();
	    }

	    @Override
	    public List<Product> getTopProducts(String category, int minPrice, int maxPrice, int n, int page, String sort, String order) {
	        String url = String.format("/companies/companyname/categories/%s/products/top-%dPrice-%dmaxPrice%d?page=%d&sort=%s&order=%s",
	                category, n, minPrice, maxPrice, page, sort, order);
	        Mono<List<Product>> response = this.webClient.get()
	                .uri(url)
	                .header(HttpHeaders.AUTHORIZATION, "Bearer " + authToken) // Include the authorization token in the header
	                .retrieve()
	                .bodyToMono(Product[].class)
	                .map(List::of);
	        return response.block();
	    }

	    @Override
	    public Product getProductDetails(String productId) {
	        String url = "/products/" + productId;
	        Mono<Product> response = this.webClient.get()
	                .uri(url)
	                .header(HttpHeaders.AUTHORIZATION, "Bearer " + authToken) // Include the authorization token in the header
	                .retrieve()
	                .bodyToMono(Product.class);
	        return response.block();
	    }
}
