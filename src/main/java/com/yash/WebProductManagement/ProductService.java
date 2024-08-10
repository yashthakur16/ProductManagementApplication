package com.yash.WebProductManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProductService 
{
	
	@Autowired
productDB db;
	
	public void addProduct(Product p)
	{
		db.save(p);
		System.out.println("Added successfully");
	}

	public List<Product> getProducts() {
		List<Product> products=db.findAll();
		return products;
		
	}

	public Product getProduct(String name) {
	Product p= db.findByname(name);
	return p;
	}
}
