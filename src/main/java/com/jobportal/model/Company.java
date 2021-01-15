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
@Table(name = "Company")
public class Company {
	@Id
	@Column(name = "company_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int companyId;
	
	@Column(name = "company_name")
	private String companyName;
	
	//@OneToMany(mappedBy = "companyId", fetch = FetchType.LAZY)
	private List <JobPosting> jobList = new ArrayList<>();
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(int companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}

	public Company(int companyId, String companyName, List<JobPosting> jobList) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.jobList = jobList;
	}

	public Company(String companyName, List<JobPosting> jobList) {
		super();
		this.companyName = companyName;
		this.jobList = jobList;
	}

	public int getCompanyId() {
		return companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<JobPosting> getJobList() {
		return jobList;
	}

	public void setJobList(List<JobPosting> jobList) {
		this.jobList = jobList;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", jobList=" + jobList + "]";
	}
}
