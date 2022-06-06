package com.personalNews.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.personalNews.models.Articles;
import com.personalNews.models.ArticleGroup;

@Service
public class NewsService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	
	public List<Articles> getAllNews() {
		
		String API_Key = env.getProperty("API_KEY");
		String url = "https://newsapi.org/v2/everything?q=technology&apiKey=" + API_Key;
		String url1 = "https://newsapi.org/v2/top-headlines/sources?apiKey=" + API_Key;
//		Article news = restTemplate.getForObject(url, Article.class);
		ArticleGroup news = restTemplate.getForObject(url, ArticleGroup.class); 
//		Articles article = restTemplate.getForObject(url, Articles.class);
//		return article;
		List<Articles> an = news.getArticles();
		System.out.println(an);
		return an;
	}

}
