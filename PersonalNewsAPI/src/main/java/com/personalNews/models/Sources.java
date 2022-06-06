package com.personalNews.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table
public class Sources {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cat_id;
	
	//this column is a api string id 		
	private String id;
	private String category;
	
	
	public Sources() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Sources(String id, String category) {
		super();
		this.id = id;
		this.category = category;
	}



	public Sources(int cat_id, String id, String category) {
		super();
		this.cat_id = cat_id;
		this.id = id;
		this.category = category;
	}

	
	


	public int getCat_id() {
		return cat_id;
	}



	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cat_id;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Sources other = (Sources) obj;
		if (cat_id != other.cat_id)
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Sources [cat_id=" + cat_id + ", id=" + id + ", category=" + category + "]";
	}
	
	

	
	
	
	
	
}
