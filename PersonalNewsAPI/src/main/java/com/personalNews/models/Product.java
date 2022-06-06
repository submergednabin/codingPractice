//package com.personalNews.models;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import org.springframework.stereotype.Repository;
//
//@Repository
//@Entity
//@Table(name="product_news") //Mapping entity to database table with table name  product news
//public class Product {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "product_id")
//	private int id;
//	
//	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinColumn(name = "category_id")
////	private Category category;
//	
//	private String title;
//	
//	@Column(name = "image_url")
//	private String image;
//	
//	private String description;
//	
//	private String status;
//	
//	private String author;
//	
//	@Column(name = "source_url")
//	private String source;
//
//	public Product() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Product(int id, Category category, String title, String image, String description, String status,
//			String author, String source) {
//		super();
//		this.id = id;
//		this.category = category;
//		this.title = title;
//		this.image = image;
//		this.description = description;
//		this.status = status;
//		this.author = author;
//		this.source = source;
//	}
//
//	public Product(Category category, String title, String image, String description, String status, String author,
//			String source) {
//		super();
//		this.category = category;
//		this.title = title;
//		this.image = image;
//		this.description = description;
//		this.status = status;
//		this.author = author;
//		this.source = source;
//	}
//
//	
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public Category getCategory() {
//		return category;
//	}
//
//	public void setCategory(Category category) {
//		this.category = category;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getImage() {
//		return image;
//	}
//
//	public void setImage(String image) {
//		this.image = image;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
//
//	public String getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//
//	public String getSource() {
//		return source;
//	}
//
//	public void setSource(String source) {
//		this.source = source;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((author == null) ? 0 : author.hashCode());
//		result = prime * result + ((category == null) ? 0 : category.hashCode());
//		result = prime * result + ((description == null) ? 0 : description.hashCode());
//		result = prime * result + id;
//		result = prime * result + ((image == null) ? 0 : image.hashCode());
//		result = prime * result + ((source == null) ? 0 : source.hashCode());
//		result = prime * result + ((status == null) ? 0 : status.hashCode());
//		result = prime * result + ((title == null) ? 0 : title.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Product other = (Product) obj;
//		if (author == null) {
//			if (other.author != null)
//				return false;
//		} else if (!author.equals(other.author))
//			return false;
//		if (category == null) {
//			if (other.category != null)
//				return false;
//		} else if (!category.equals(other.category))
//			return false;
//		if (description == null) {
//			if (other.description != null)
//				return false;
//		} else if (!description.equals(other.description))
//			return false;
//		if (id != other.id)
//			return false;
//		if (image == null) {
//			if (other.image != null)
//				return false;
//		} else if (!image.equals(other.image))
//			return false;
//		if (source == null) {
//			if (other.source != null)
//				return false;
//		} else if (!source.equals(other.source))
//			return false;
//		if (status == null) {
//			if (other.status != null)
//				return false;
//		} else if (!status.equals(other.status))
//			return false;
//		if (title == null) {
//			if (other.title != null)
//				return false;
//		} else if (!title.equals(other.title))
//			return false;
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		return "Product [id=" + id + ", category=" + category + ", title=" + title + ", image=" + image
//				+ ", description=" + description + ", status=" + status + ", author=" + author + ", source=" + source
//				+ "]";
//	}
//	
//	
//	
//}
