package com.personalNews.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NewsBox {
	
	private String Status;
	private int totalResults;
	
	private Articles article;

	public NewsBox() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NewsBox(String status, int totalResults, Articles article) {
		super();
		Status = status;
		this.totalResults = totalResults;
		this.article = article;
	}

	public NewsBox(int totalResults, Articles article) {
		super();
		this.totalResults = totalResults;
		this.article = article;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}

	public Articles getArticle() {
		return article;
	}

	public void setArticle(Articles article) {
		this.article = article;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Status == null) ? 0 : Status.hashCode());
		result = prime * result + ((article == null) ? 0 : article.hashCode());
		result = prime * result + totalResults;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewsBox other = (NewsBox) obj;
		if (Status == null) {
			if (other.Status != null)
				return false;
		} else if (!Status.equals(other.Status))
			return false;
		if (article == null) {
			if (other.article != null)
				return false;
		} else if (!article.equals(other.article))
			return false;
		if (totalResults != other.totalResults)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NewsBox [Status=" + Status + ", totalResults=" + totalResults + ", article=" + article + "]";
	}
	
}
