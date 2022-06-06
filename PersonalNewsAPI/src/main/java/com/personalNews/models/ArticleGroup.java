package com.personalNews.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArticleGroup {
	
	private List<Articles> articles;
	
	private String status;
	
	private int totalResults;

	public ArticleGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArticleGroup(List<Articles> articles, String status, int totalResults) {
		super();
		this.articles = articles;
		this.status = status;
		this.totalResults = totalResults;
	}

	public List<Articles> getArticles() {
		return articles;
	}

	public void setArticles(List<Articles> articles) {
		this.articles = articles;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}

	@Override
	public String toString() {
		return "ArticleGroup [articles=" + articles + ", status=" + status + ", totalResults=" + totalResults + "]";
	}
	
	
	
	
	
	

}
