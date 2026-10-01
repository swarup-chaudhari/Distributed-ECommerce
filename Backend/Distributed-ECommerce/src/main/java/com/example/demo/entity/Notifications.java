package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Notifications {

	@Id
	private String id;

	private String customerId;

	private Long orderId;

	private String type;

	private String message;

	private String status;

	private LocalDateTime createdAt;

	public Notifications() {
	}

	public Notifications(String customerId, Long orderId, String type, String message, String status,
			LocalDateTime createdAt) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.type = type;
		this.message = message;
		this.status = status;
		this.createdAt = createdAt;
	}

	public Notifications(String id, String customerId, Long orderId, String type, String message, String status,
			LocalDateTime createdAt) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.orderId = orderId;
		this.type = type;
		this.message = message;
		this.status = status;
		this.createdAt = createdAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}
