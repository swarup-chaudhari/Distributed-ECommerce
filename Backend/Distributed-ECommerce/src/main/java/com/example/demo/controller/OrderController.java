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

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;

@RequestMapping("/orders")
@RestController
@CrossOrigin
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	
	@GetMapping
	public List<Order> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@GetMapping("/{id}")
	public Order getOrderById(@PathVariable("id")Long id) {
		return orderService.getOrderById(id);
	}
	
	@PostMapping
	public String saveOrders(@RequestBody()Order order) {
		return orderService.saveOrders(order);
	}
	
	@PutMapping("/{id}")
	public String updateOrders(@RequestBody()Order order,@PathVariable("id")Long id) {
		return orderService.updateOrders(order,id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteOrderById(@PathVariable("id")Long id) {
		return orderService.deleteOrderById(id);
		
	}

	
}
