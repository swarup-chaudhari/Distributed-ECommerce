package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Notifications;
import com.example.demo.repository.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	NotificationRepository notificationRepository;
	
	public List<Notifications> getAllNotification() {
		// TODO Auto-generated method stub
		
		return notificationRepository.findAll();
	}

	public Notifications getNotificationById(String id) {
		// TODO Auto-generated method stub
		return notificationRepository.findById(id).orElse(null);
	}

	public String saveNotification(Notifications notifications) {
		notificationRepository.save(notifications);
		// TODO Auto-generated method stub
		return "Notification Saved Successfully";
	}

	public String updateNotifications(Notifications notifications, String id) {
		// TODO Auto-generated method stub
		Notifications exiNotifications=notificationRepository.findById(null).orElse(null);
		
		if(exiNotifications==null) {
			return "Notification Not Exist";
		}
		
		exiNotifications.setOrderId(notifications.getOrderId());
		exiNotifications.setCustomerId(notifications.getCustomerId());
		exiNotifications.setMessage(notifications.getMessage());
		exiNotifications.setType(notifications.getType());
		exiNotifications.setStatus(notifications.getStatus());
		exiNotifications.setCreatedAt(notifications.getCreatedAt());
		
		notificationRepository.save(exiNotifications);
		
		
		
		return "Notifications Updated Successfully";
	}

	public String deleteNotification(String id) {
		// TODO Auto-generated method stub
		
		Notifications exisNotifications=notificationRepository.findById(id).orElse(null);
		
		if(exisNotifications==null) {
			return "Notification Not Exist";
		}
		
		notificationRepository.deleteById(id);
		
		return "Notification Deleted Successfully";
	}
	
	

}
