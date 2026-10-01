package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		
		return productRepository.findAll();
	}

	public Product getProductById(String id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElse(null);
	}

	public String saveProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
		return "Product Saved Successfully";
	}

	public String updateProduct(Product product, String id) {
		// TODO Auto-generated method stub
		Product exisProduct=productRepository.findById(id).orElse(null);
		
		if(exisProduct==null) {
			return "Product Not Found";
		}
		
		exisProduct.setName(product.getName());
		exisProduct.setDescription(product.getDescription());
		exisProduct.setPrice(product.getPrice());
		exisProduct.setCategory(product.getCategory());
		exisProduct.setIsActive(product.getIsActive());
		exisProduct.setImageUrl(product.getImageUrl());
		
		productRepository.save(exisProduct);
		
		return "Product Updated Successfully";
	}

	public String deleteProductById(String id) {
		// TODO Auto-generated method stub
		
		Product exisProduct=productRepository.findById(id).orElse(null);
		
		if(exisProduct==null) {
			return "Product Not Found";
		}
		productRepository.deleteById(id);
		return "Product Deleted Successfully";
	}
}
