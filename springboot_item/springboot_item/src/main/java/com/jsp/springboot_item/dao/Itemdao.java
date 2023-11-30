package com.jsp.springboot_item.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springboot_item.dto.Item;
import com.jsp.springboot_item.repo.Itemrepo;
@Repository
public class Itemdao {
	@Autowired //relation between two 
	private Itemrepo itemrepo;
	//1-save
	public Item saveitem(Item item) {
		return itemrepo.save(item);
		
	}
	//update
	public Item updateitem(int id, Item item) {
		Optional<Item> item2= itemrepo.findById(id);
		
		if (item2.isPresent()) {
			item.setId(id);
			return itemrepo.save(item);
			
		}else {
			return null;
		}		
	}
	//delete
	public Item deleteItem(int id) {
		Item item= itemrepo.findById(id).get();
		itemrepo.delete(item);
		return item;
		
	}
	//get by id
	public Item getItembyid(int id) {
	return	itemrepo.findById(id).get();
		
	}
	//get all item
	public List<Item> getallItems() {
		return itemrepo.findAll();
		
	}

}
