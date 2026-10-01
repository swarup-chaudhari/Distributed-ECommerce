package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable("id")String id) {
		return productService.getProductById(id);
	}
	
	@PostMapping
	public String saveProduct(@RequestBody()Product product) {
		return productService.saveProduct(product);
	}
	
	@PutMapping("/{id}")
	public String updateProduct(@RequestBody()Product product,@PathVariable("id")String id) {
		return productService.updateProduct(product,id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteProductById(@PathVariable("id")String id) {
		return productService.deleteProductById(id);
	}
	

}
