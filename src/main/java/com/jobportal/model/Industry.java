package com.jobportal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Industry")
public class Industry {
	@Id
	@Column(name = "industry_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int industryId;
	
	@Column(name = "industry_name")
	private String industryName;
	
	//@OneToMany(mappedBy = "industryId", fetch = FetchType.LAZY)
	private List <JobPosting> jobList = new ArrayList<>();
	
	public Industry() {
		// TODO Auto-generated constructor stub
	}
	
	public Industry(int industryId, String industryName) {
		super();
		this.industryId = industryId;
		this.industryName = industryName;
	}

	public Industry(int industryId, String industryName, List<JobPosting> jobList) {
		super();
		this.industryId = industryId;
		this.industryName = industryName;
		this.jobList = jobList;
	}

	public Industry(String industryName, List<JobPosting> jobList) {
		super();
		this.industryName = industryName;
		this.jobList = jobList;
	}

	public int getIndustryId() {
		return industryId;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public List<JobPosting> getJobList() {
		return jobList;
	}

	public void setJobList(List<JobPosting> jobList) {
		this.jobList = jobList;
	}

	@Override
	public String toString() {
		return "Industry [industryId=" + industryId + ", industryName=" + industryName + ", jobList=" + jobList + "]";
	}
}
