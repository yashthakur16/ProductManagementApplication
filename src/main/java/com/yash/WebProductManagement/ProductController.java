package com.yash.WebProductManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController 
{
	@Autowired
	ProductService ps;
	
	@GetMapping("/products")
	public List<Product> getProducts()
	{
		return ps.getProducts();
	}
	
	@GetMapping("/product/{name}")
	public Product getProduct(@PathVariable String name)
	{
		return ps.getProduct(name);
	
	}
	
	@PostMapping("/product")
	public void addProduct(@RequestBody Product p)
	{
		ps.addProduct(p);
	}
	
	
	
}
