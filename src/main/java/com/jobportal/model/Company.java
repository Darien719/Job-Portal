package com.jobportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Company")
public class Company {
	@Id
	@Column(name = "company_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int companyId;
	
	@Id
	@Column(name = "company_name")
	private String companyName;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(int companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + "]";
	}
}
