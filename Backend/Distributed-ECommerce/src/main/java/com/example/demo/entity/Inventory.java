package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long productId;
	
	private Integer reservedQuantity;
	
	private Integer availableQuantity;
	
	private LocalDateTime updatedAt;
	
	
	public Inventory() {}


	public Inventory(Long id, Long productId, Integer reservedQuantity, Integer availableQuantity,
			LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.productId = productId;
		this.reservedQuantity = reservedQuantity;
		this.availableQuantity = availableQuantity;
		this.updatedAt = updatedAt;
	}


	public Inventory(Long productId, Integer reservedQuantity, Integer availableQuantity, LocalDateTime updatedAt) {
		super();
		this.productId = productId;
		this.reservedQuantity = reservedQuantity;
		this.availableQuantity = availableQuantity;
		this.updatedAt = updatedAt;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getProductId() {
		return productId;
	}


	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public Integer getReservedQuantity() {
		return reservedQuantity;
	}


	public void setReservedQuantity(Integer reservedQuantity) {
		this.reservedQuantity = reservedQuantity;
	}


	public Integer getAvailableQuantity() {
		return availableQuantity;
	}


	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}


	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}


	public String saveInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
