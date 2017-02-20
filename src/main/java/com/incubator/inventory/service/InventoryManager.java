package com.incubator.inventory.service;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incubator.inventory.entity.Product;

@RestController
public interface InventoryManager {
	@RequestMapping(path="/isAvailable/{productName}", produces={MediaType.TEXT_HTML_VALUE,"application/*"})
	String checkAvailability(@PathVariable("productName") Product productName);
	@RequestMapping(path="/Products", produces={MediaType.APPLICATION_JSON_VALUE})
	List<Product> getProducts();	
	List<Product> searchProducts( Predicate<Product> searchCriteria , Product product);
	
	List<Product> getProductsByType(Predicate<Product> searchCriteria , Product product);
	
	Product getProductInfo();
	
}
