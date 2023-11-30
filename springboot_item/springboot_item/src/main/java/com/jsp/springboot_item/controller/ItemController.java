package com.jsp.springboot_item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springboot_item.dao.Itemdao;
import com.jsp.springboot_item.dto.Item;

@RestController
public class ItemController {
	
	@Autowired
	private Itemdao itemdao;
	
	
	//1-save
	@PostMapping("/saveitem")
	public Item saveItem(@RequestBody Item item) {
		return itemdao.saveitem(item);
		}
	
	
	//2-update
	@PutMapping("/updateitem")
	public Item updatItem(@RequestParam int id,@RequestBody Item item) {
		return itemdao.updateitem(id, item);
	}
	
	
	//3-delete
	@DeleteMapping("/deleteitem")
	public Item deleItem(@RequestParam int id) {
		return itemdao.deleteItem(id);	
	}
	
	
	//4-get by id
	@GetMapping("/getitembyid")
	public Item getItembyid(@RequestParam int id) {
		return itemdao.getItembyid(id);
	}
	
	
	//5-get all
	@GetMapping("/getallitem")
	public List<Item> getallItems() {
		return itemdao.getallItems();	
	}
	
	
}
