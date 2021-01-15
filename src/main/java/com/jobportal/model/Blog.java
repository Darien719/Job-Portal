package com.jobportal.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BLOG")
public class Blog {
	
	@Id
	@Column(name="blog_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int blogId;
	
	//@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="blog_owner_id")
	private int ownerId;
	
	@Column(name="blog_title")
	private String blogTitle;
	
	@Column(name="blog_date")
	private Date date;
	
	@Column(name="blog_content")
	private String blogContent;
	
	public Blog() {
		// TODO Auto-generated constructor stub
	}

	public Blog(int blogId, int ownerId, String blogTitle, Date date, String blogContent) {
		super();
		this.blogId = blogId;
		this.ownerId = ownerId;
		this.blogTitle = blogTitle;
		this.date = date;
		this.blogContent = blogContent;
	}
	
	public Blog(int ownerId, String blogTitle, Date date, String blogContent) {
		super();
		this.ownerId = ownerId;
		this.blogTitle = blogTitle;
		this.date = date;
		this.blogContent = blogContent;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	public int getBlogId() {
		return blogId;
	}

	@Override
	public String toString() {
		return "blog [blogId=" + blogId + ", ownerId=" + ownerId + ", blogTitle=" + blogTitle + ", date=" + date
				+ ", blogContent=" + blogContent + "]";
	}
	
	
	
	
}
