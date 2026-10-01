package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Payment;
import com.example.demo.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	PaymentRepository paymentRepository;

	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return paymentRepository.findAll();
	}

	public Payment getPaymentById(Long id) {
		// TODO Auto-generated method stub
		return paymentRepository.findById(id).orElse(null);
	}

	public String savePayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentRepository.save(payment);
		return "Payment Saved Successfully";
	}

	public String updatePayment(Payment payment, Long id) {
		// TODO Auto-generated method stub
		
		Payment exisPayment=paymentRepository.findById(id).orElse(null);
		
		if(exisPayment==null) {
			return "Payment Details Not Found";
		}
		
		exisPayment.setAmount(payment.getAmount());
		exisPayment.setOrder(payment.getOrder());
		exisPayment.setOrder(payment.getOrder());
		exisPayment.setCustomerId(payment.getCustomerId());
		exisPayment.setPaymentStatus(payment.getPaymentStatus());
		exisPayment.setTransactionId(payment.getTransactionId());
		
		paymentRepository.save(exisPayment);
		
		return "Payment Details Updated Successfully";
	}

	public String deletePaymentDetails(Long id) {
		// TODO Auto-generated method stub
		Payment exisPayment=paymentRepository.findById(id).orElse(null);
		
		if(exisPayment==null) {
			return "Payment Details Not Found";
		}
		paymentRepository.deleteById(id);
		
		return "Payment Details Deleted Successfully";
	}

}
