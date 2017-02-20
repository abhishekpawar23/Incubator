package com.incubator.inventory.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.incubator.inventory.entity.Product;

@Configuration
public class ProductBeanConfiguration {

	@Bean
	public List<Product> listOfProducts()
	{
		List<Product> listOfProdcuts = new ArrayList<>();
		listOfProdcuts.add(new Product("HP Cartridge 720","HP001",850.00,1250.00,1500.00,5.00,1000,"Computer Peripehrals"));
		listOfProdcuts.add(new Product("HP Cartridge 721","HP002",850.00,1250.00,1500.00,5.00,1000,"Computer Peripehrals"));
		listOfProdcuts.add(new Product("HP Cartridge 722","HP003",850.00,1250.00,1500.00,5.00,1000,"Computer Peripehrals"));
		listOfProdcuts.add(new Product("HP Cartridge 723","HP004",850.00,1250.00,1500.00,5.00,1000,"Computer Peripehrals"));
		return listOfProdcuts;
	}
}
