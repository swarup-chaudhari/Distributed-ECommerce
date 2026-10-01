package com.example.demo.service;

import com.example.demo.repository.OrderRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.OrderItem;
import com.example.demo.repository.OrderItemRepository;

@Service
public class OrderItemService {

	private final OrderRepository orderRepository;
	@Autowired
	OrderItemRepository orderItemRepository;

	OrderItemService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public List<OrderItem> getAllOrderItems() {
		// TODO Auto-generated method stub
		return orderItemRepository.findAll();
	}

	public OrderItem getOrderItemsById(Long id) {
		// TODO Auto-generated method stub
		return orderItemRepository.findById(id).orElse(null);
	}

	public String saveOrderItems(OrderItem orderItem) {
		// TODO Auto-generated method stub
		orderItemRepository.save(orderItem);
		return "Order Item Saved Successfully";
	}

	public String updateOrderItems(OrderItem orderItem, Long id) {
		// TODO Auto-generated method stub
		OrderItem exisItem=orderItemRepository.findById(id).orElse(null);
		
		if(exisItem==null) {
			return "OrderItem Not Found";
		}
		
		exisItem.setPrice(orderItem.getPrice());
		exisItem.setProductId(orderItem.getProductId());
		exisItem.setOrder(orderItem.getOrder());
		exisItem.setQuantity(orderItem.getQuantity());
		
		orderItemRepository.save(exisItem);
		
		
		return "Order Item Updated Successfully";
	}

	public String deleteOrderItemById(Long id) {
		// TODO Auto-generated method stub
		OrderItem exisItem=orderItemRepository.findById(id).orElse(null);
		
		if(exisItem==null) {
			return "Order Item Not Found";
		}
		orderRepository.deleteById(id);
		
		return "Order Item Deleted Successfully";
	}
}
