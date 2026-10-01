package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	private String customerId;
	
	private BigDecimal amount;
	
	@Enumerated(EnumType.STRING)
	private PaymentStatus paymentStatus;
	
	private String transactionId;
	
	private LocalDateTime createdAt;
	
	
	public Payment() {}


	public Payment(Long id, Order order, String customerId, BigDecimal amount, PaymentStatus paymentStatus,
			String transactionId, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.order = order;
		this.customerId = customerId;
		this.amount = amount;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
		this.createdAt = createdAt;
	}


	public Payment(Order order, String customerId, BigDecimal amount, PaymentStatus paymentStatus, String transactionId,
			LocalDateTime createdAt) {
		super();
		this.order = order;
		this.customerId = customerId;
		this.amount = amount;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
		this.createdAt = createdAt;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public BigDecimal getAmount() {
		return amount;
	}


	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}


	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public String getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	
}
