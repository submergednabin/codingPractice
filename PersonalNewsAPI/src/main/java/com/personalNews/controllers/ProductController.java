//package com.personalNews.controllers;
//
//import java.util.List;
//
//import org.apache.tomcat.util.json.JSONParser;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import com.personalNews.models.Product;
//import com.personalNews.services.ProductService;
//
//@RestController
//@RequestMapping(value="/products")
//public class ProductController {
//	
//	private ProductService ps;
//	
//	@Autowired
//	private Environment env;
//	
//	@Autowired
//	public ProductController(ProductService ps) {
//		super();
//		this.ps = ps;
//	}
//	
//	@GetMapping(value = "/all")
//	public ResponseEntity<String> getAllProduct(){
//		
//		RestTemplate restTemplate = new RestTemplate();
//		String API_Key = env.getProperty("API_KEY");
//		String url = "https://newsapi.org/v2/everything?q=techonology&apiKey=" + API_Key;
//		String url1 = "https://newsapi.org/v2/top-headlines/sources?apiKey=" + API_Key;
//		ResponseEntity<String> response
//		  = restTemplate.getForEntity(url1, String.class);
//		response.getClass().getClass().getName();
//		return response;
//
//		
//		
////		return ResponseEntity.status(200).body();
//		
//	}
//	
//	
//}
