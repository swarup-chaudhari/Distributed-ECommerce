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

import com.example.demo.entity.Notifications;
import com.example.demo.service.NotificationService;

@RestController
@RequestMapping("/notifications")
@CrossOrigin
public class NoticifationController {

	@Autowired
	NotificationService notificationService;

	@GetMapping
	public List<Notifications> getAllNotification() {
		return notificationService.getAllNotification();
	}

	@GetMapping("/{id}")
	public Notifications getNotificationById(@PathVariable("id") String id) {
		return notificationService.getNotificationById(id);
	}

	@PostMapping
	public String saveNotification(@RequestBody() Notifications notifications) {
		return notificationService.saveNotification(notifications);
	}

	@PutMapping("/{id}")
	public String updateNotifications(@RequestBody() Notifications notifications, @PathVariable("id") String id) {
		return notificationService.updateNotifications(notifications, id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteNotification(@PathVariable("id")String id) {
		return notificationService.deleteNotification(id);
	}
}
