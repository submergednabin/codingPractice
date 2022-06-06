package com.personalNews.services;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.personalNews.daos.CategoryRepository;
import com.personalNews.models.Categories;
import com.personalNews.models.Sources;

@Service
public class CategoryService {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private CategoryRepository category;
	
	public List<Sources> getAllCategory() {
		
		String API_Key = env.getProperty("API_KEY");

		String url = "https://newsapi.org/v2/top-headlines/sources?apiKey=" + API_Key;

		Categories categoryList = restTemplate.getForObject(url, Categories.class); 
		
		List<Sources> an = categoryList.getSources();
		System.out.println(an);
		return an;
	}
	
	public String addAllCat() {
		
		String API_Key = env.getProperty("API_KEY");
		String url = "https://newsapi.org/v2/top-headlines/sources?apiKey=" + API_Key;
		
		Categories categoryList = restTemplate.getForObject(url, Categories.class); 
		List<Sources> an = categoryList.getSources();
//		an = new ArrayList<>();
		Sources s = new Sources();
		 
		category.saveAll(an);

		return "done:";
		
	}


	public String findUniqueCategories() {
		String API_Key = env.getProperty("API_KEY");
		String url = "https://newsapi.org/v2/top-headlines/sources?apiKey=" + API_Key;

		
		Categories categoryList = restTemplate.getForObject(url, Categories.class); 
		
		List<Sources> an = categoryList.getSources();
		
		List<String> cat = an.stream().map(Sources::getCategory).distinct().collect(Collectors.toList());
		
		System.out.println(cat);
		for(String i:cat) {
			Sources s = new Sources();
			s.setCategory(i);
			category.save(s);
		}

		return "added";

	}


	
	

}
