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

import com.example.demo.entity.Inventory;
import com.example.demo.service.InventoryService;

@RestController
@RequestMapping("/Inventory")
@CrossOrigin
public class InventoryController {

	@Autowired
	InventoryService inventoryService;

	@GetMapping
	public List<Inventory> getAllInventories() {
		return inventoryService.getAllInventories();
	}

	@GetMapping("/{id}")
	public Inventory getInventoryById(@PathVariable("id") Long id) {
		return inventoryService.getInventoryById(id);
	}

	@PostMapping
	public String saveInventory(@RequestBody() Inventory inventory) {
		return inventoryService.saveInventory(inventory);
	}

	@PutMapping("/{id}")
	public String updateInventory(@RequestBody() Inventory inventory, @PathVariable("id") Long id) {
		return inventoryService.updateInventory(inventory,id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteInventory(@PathVariable("id")Long id) {
		return inventoryService.deleteInvetory(id);
	}
}
