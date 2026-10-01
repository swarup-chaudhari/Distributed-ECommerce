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

import com.example.demo.entity.Payment;
import com.example.demo.service.PaymentService;

@RequestMapping("/payments")
@RestController
@CrossOrigin
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	@GetMapping
	public List<Payment> getAllPayments(){
		return paymentService.getAllPayments();
	}
	
	@GetMapping("/{id}")
	public Payment getPaymentById(@PathVariable("id")Long id) {
		return paymentService.getPaymentById(id);
	}
	
	@PostMapping
	public String savePayment(@RequestBody()Payment payment) {
		return paymentService.savePayment(payment);
	}
	
	@PutMapping("/{id}")
	public String updatePayment(@RequestBody()Payment payment,@PathVariable("id")Long id) {
		return paymentService.updatePayment(payment,id);
	}
	
	@DeleteMapping("/{id}")
	public String deletePaymentDetails(@PathVariable("id")Long id) {
		return paymentService.deletePaymentDetails(id);
	}
	
	
}
