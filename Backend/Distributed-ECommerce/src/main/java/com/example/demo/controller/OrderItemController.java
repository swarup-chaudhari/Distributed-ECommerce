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

import com.example.demo.entity.OrderItem;
import com.example.demo.service.OrderItemService;

@RestController
@RequestMapping("/orderItems")
@CrossOrigin
public class OrderItemController {

	@Autowired
	OrderItemService orderItemService;
	
	
	@GetMapping
	public List<OrderItem> getAllOrderItems(){
		return orderItemService.getAllOrderItems();
	}
	
	@GetMapping("/{id}")
	public OrderItem getOrderItemsById(@PathVariable("id")Long id) {
		return orderItemService.getOrderItemsById(id);
	}
	
	@PostMapping
	public String saveOrderItems(@RequestBody()OrderItem orderItem) {
		return orderItemService.saveOrderItems(orderItem);
	}
	
	@PutMapping("/{id}")
	public String updateOrderItems(@RequestBody()OrderItem orderItem,@PathVariable("id")Long id) {
		return orderItemService.updateOrderItems(orderItem,id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteOrderItemById(@PathVariable("id")Long id) {
		return orderItemService.deleteOrderItemById(id);
	}
}
