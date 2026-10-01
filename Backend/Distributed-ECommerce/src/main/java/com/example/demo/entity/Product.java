package com.example.demo.entity;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
@Document(collation = "products")
public class Product {
	@Id
	
	private String  id;
	
	private String name;
	
	private BigDecimal price;
	
	private String description;
	
	private String imageUrl;
	
	private Boolean isActive;
	
	private String category;
	
	
	public Product() {}


	public Product(String id, String name, BigDecimal price, String description, String imageUrl, Boolean isActive,
			String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageUrl = imageUrl;
		this.isActive = isActive;
		this.category = category;
	}


	public Product(String name, BigDecimal price, String description, String imageUrl, Boolean isActive,
			String category) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageUrl = imageUrl;
		this.isActive = isActive;
		this.category = category;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
