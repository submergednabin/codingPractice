package com.personalNews.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.personalNews.models.Categories;
import com.personalNews.models.Sources;
import com.personalNews.services.CategoryService;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {
	
	private CategoryService cs;

	@Autowired
	public CategoryController(CategoryService cs) {
		super();
		this.cs=cs;
	}
	
	@Autowired
	private Environment env;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value = "all")
	public ResponseEntity<List<Sources>> getAll(){
		 
		List<Sources> category = cs.getAllCategory();
		
		return ResponseEntity.status(200).body(category);
		
	}
	
	/*
	 * Add all Categories 
	 */
	@PostMapping(value="add-all")
	public ResponseEntity<String> addCategory(){
		
		String cat = cs.addAllCat();
		return ResponseEntity.status(200).body(cat);
		
	}
	

	/*
	 * Add Distinct or Unique Categories only
	 */
	@PostMapping(value = "add-distinct")
	public ResponseEntity<String> findDistinctCategories(){
		
		String src = cs.findUniqueCategories();
		return ResponseEntity.status(201).body(src);
	}
	
	
}
