package com.incubator.inventory.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.incubator.inventory.configuration.ProductBeanConfiguration;
import com.incubator.inventory.entity.Product;
import com.incubator.inventory.service.InventoryManager;

@EnableAutoConfiguration
@Import(ProductBeanConfiguration.class)
public class InventoryManagerImpl implements InventoryManager {


	@Autowired	private List<Product> listOfProducts;

	public static void main(String[] args) throws Exception {

		SpringApplication.run(InventoryManagerImpl.class, args);
		/*ApplicationContext ctx = 
				   new AnnotationConfigApplicationContext(ProductBeanConfiguration.class);*/
	}


	@Override
	public String checkAvailability(Product product) {

		//System.out.println(product1);
		return null != searchProducts(p -> p.getProductName().equals("Paper"), product) && ! searchProducts(p -> p.getProductName().equals("Paper"), product).isEmpty() ? "Available" : "Not Available";
	}

	@Override
	public List<Product> getProducts() {

		return  listOfProducts;
	}

	@Override
	public List<Product> searchProducts(Predicate<Product> searchCriteria, Product product) {
		ArrayList<Product> listOFProducts = new ArrayList<>();

		if(searchCriteria.test(product))
		{
			listOFProducts.add(product);
		}
		return listOFProducts;
	}


	@Override
	public List<Product> getProductsByType(Predicate<Product> searchCriteria, Product product) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Product getProductInfo() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Product> getListOfProducts() {
		return listOfProducts;
	}


	public void setListOfProducts(List<Product> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}


}
