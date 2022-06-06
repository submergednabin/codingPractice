package com.personalNews.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Categories {
	
	//list all the category from source list
	private List<Sources> sources;
	private String status;
	
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categories(List<Sources> sources, String status) {
		super();
		this.sources = sources;
		this.status = status;
	}

	public List<Sources> getSources() {
		return sources;
	}

	public void setSources(List<Sources> sources) {
		this.sources = sources;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sources == null) ? 0 : sources.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Categories other = (Categories) obj;
		if (sources == null) {
			if (other.sources != null)
				return false;
		} else if (!sources.equals(other.sources))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Categories [sources=" + sources + ", status=" + status + "]";
	}

		
	
}
