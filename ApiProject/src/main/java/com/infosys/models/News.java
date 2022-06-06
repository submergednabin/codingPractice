package com.infosys.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class News {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "news_id")
	private int id;
	
	private String status;
	
	private String title;
	
	private String content;
	
	private String url;
	
	@Column(name = "image_url")
	private String urlToImage;
	
	@Column(name="published_at")
	private Date publishedAt;
	
	private  String source;

	public News() {
		super();
		// TODO Auto-generated constructor stub
	}

	public News(int id, String status, String title, String content, String url, String urlToImage, Date publishedAt,
			String source) {
		super();
		this.id = id;
		this.status = status;
		this.title = title;
		this.content = content;
		this.url = url;
		this.urlToImage = urlToImage;
		this.publishedAt = publishedAt;
		this.source = source;
	}

	public News(String status, String title, String content, String url, String urlToImage, Date publishedAt,
			String source) {
		super();
		this.status = status;
		this.title = title;
		this.content = content;
		this.url = url;
		this.urlToImage = urlToImage;
		this.publishedAt = publishedAt;
		this.source = source;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlToImage() {
		return urlToImage;
	}

	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}

	public Date getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + id;
		result = prime * result + ((publishedAt == null) ? 0 : publishedAt.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + ((urlToImage == null) ? 0 : urlToImage.hashCode());
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
		News other = (News) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (id != other.id)
			return false;
		if (publishedAt == null) {
			if (other.publishedAt != null)
				return false;
		} else if (!publishedAt.equals(other.publishedAt))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (urlToImage == null) {
			if (other.urlToImage != null)
				return false;
		} else if (!urlToImage.equals(other.urlToImage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", status=" + status + ", title=" + title + ", content=" + content + ", url=" + url
				+ ", urlToImage=" + urlToImage + ", publishedAt=" + publishedAt + ", source=" + source + "]";
	}
	
	
}
