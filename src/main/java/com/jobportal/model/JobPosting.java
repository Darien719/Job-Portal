package com.jobportal.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Job_Posting")
public class JobPosting {
	@Id
	@Column(name = "posting_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int postingId;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "poster_id")
	@JsonIgnore
	private int posterId;
	
	//TO IMPORT TAGS
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Tags> tags;
	
	@Column (name = "date", nullable = false)
	private Timestamp date;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column (name = "description", nullable = false)
	private String description;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "location")
	@JsonIgnore
	private int location;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "industry")
	@JsonIgnore
	private int industry;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "company")
	@JsonIgnore
	private int company;
	
	public JobPosting() {
		// TODO Auto-generated constructor stub
	}

	public JobPosting(int postingId, int posterId, Timestamp date, String title, String description, int location,
			int industry, int company) {
		super();
		this.postingId = postingId;
		this.posterId = posterId;
		this.date = date;
		this.title = title;
		this.description = description;
		this.location = location;
		this.industry = industry;
		this.company = company;
	}

	public JobPosting(int posterId, Timestamp date, String title, String description, int location, int industry,
			int company) {
		super();
		this.posterId = posterId;
		this.date = date;
		this.title = title;
		this.description = description;
		this.location = location;
		this.industry = industry;
		this.company = company;
	}

	public int getPostingId() {
		return postingId;
	}

	public int getPosterId() {
		return posterId;
	}

	public void setPosterId(int posterId) {
		this.posterId = posterId;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public int getIndustry() {
		return industry;
	}

	public void setIndustry(int industry) {
		this.industry = industry;
	}

	public int getCompany() {
		return company;
	}

	public void setCompany(int company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "JobPosting [postingId=" + postingId + ", posterId=" + posterId + ", date=" + date + ", title=" + title
				+ ", description=" + description + ", location=" + location + ", industry=" + industry + ", company="
				+ company + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobPosting other = (JobPosting) obj;
		if (company != other.company)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (industry != other.industry)
			return false;
		if (location != other.location)
			return false;
		if (posterId != other.posterId)
			return false;
		if (postingId != other.postingId)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
}
