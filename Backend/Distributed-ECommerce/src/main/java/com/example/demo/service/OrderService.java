package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	public Order getOrderById(Long id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id).orElse(null);
	}

	public String saveOrders(Order order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);
		return "Order Saved Successfully";
	}

	public String updateOrders(Order order, Long id) {
		// TODO Auto-generated method stub
		Order exisOrder=orderRepository.findById(id).orElse(null);
		
		if(exisOrder==null) {
			return "Order Not Found";
		}
		
		exisOrder.setOrderStatus(order.getOrderStatus());
		exisOrder.setTotalAmount(order.getTotalAmount());
		exisOrder.setCustomerId(order.getCustomerId());
		exisOrder.setCreatedAt(order.getCreatedAt());
		exisOrder.setUpdatedAt(order.getUpdatedAt());
		
		
		orderRepository.save(exisOrder);
		
		
		
		return "Order Updated Successfully";
	}

	public String deleteOrderById(Long id) {
		// TODO Auto-generated method stub
		
		Order exisOrder=orderRepository.findById(id).orElse(null);
		
		if(exisOrder==null) {
			return "Order Not Found";
		}
		
		orderRepository.deleteById(id);
		
		return "Order Deleted Successfully";
	}
}
