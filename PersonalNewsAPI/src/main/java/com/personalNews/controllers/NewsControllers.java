package com.personalNews.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.personalNews.models.Articles;
import com.personalNews.services.NewsService;

/**
 * 
 * @author nabinkhatri
 * This is a correct news controller with all the settings
 * product is a not the news controller
 */

@RestController
@RequestMapping("news")
@CrossOrigin(origins = "http://localhost:3000"  )
public class NewsControllers {
	
	private NewsService ns;
	
	@Autowired
	public NewsControllers(NewsService ns) {
		super();
		this.ns=ns;
		
	}
	
	@Autowired
	private Environment env;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value = "all")
	public ResponseEntity<List<Articles>> getAllNews(){
		
		List<Articles> article = ns.getAllNews();
		return ResponseEntity.status(200).body(article);
		
//		String API_Key = env.getProperty("API_KEY");
//		String url = "https://newsapi.org/v2/everything?q=techonology&apiKey=" + API_Key;
//		String url1 = "https://newsapi.org/v2/top-headlines/sources?apiKey=" + API_Key;
//		Article news = restTemplate.getForObject(url, Article.class);
//		return news;	
		
	}
	
	
	
	
}
