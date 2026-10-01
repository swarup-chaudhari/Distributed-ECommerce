package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Inventory;
import com.example.demo.repository.InventoryRepository;

@Service
public class InventoryService {

	@Autowired
	InventoryRepository inventoryRepository;
	public List<Inventory> getAllInventories() {
		// TODO Auto-generated method stub
		return inventoryRepository.findAll();
	}
	public Inventory getInventoryById(Long id) {
		// TODO Auto-generated method stub
		return inventoryRepository.findById(id).orElse(null);
	}
	public String saveInventory(Inventory inventory) {
		 inventoryRepository.save(inventory);
		 return "Inventory Saved Successfully";
	}
	public String updateInventory(Inventory inventory, Long id) {
		// TODO Auto-generated method stub
		Inventory exisInventory=inventoryRepository.findById(id).orElse(null);
		
		if(exisInventory==null) {
			return "Inventory Not Found";
		}
		exisInventory.setProductId(inventory.getProductId());
		exisInventory.setAvailableQuantity(inventory.getAvailableQuantity());
		exisInventory.setReservedQuantity(inventory.getReservedQuantity());
		exisInventory.setUpdatedAt(inventory.getUpdatedAt());
		
		inventoryRepository.save(exisInventory);
		
		return "Inventory Repository Updated Successfully";
	}
	public String deleteInvetory(Long id) {
		// TODO Auto-generated method stub
		
		Inventory exisInventory=inventoryRepository.findById(id).orElse(null);
		
		if(exisInventory==null) {
			return "Inventory Not Found";
		}
		
		inventoryRepository.deleteById(id);
		
		
		return "Inventory Deleted Successfully";
	}

}
