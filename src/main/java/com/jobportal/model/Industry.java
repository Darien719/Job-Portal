package com.jobportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Industry")
public class Industry {
	@Id
	@Column(name = "industry_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int industryId;
	
	@Id
	@Column(name = "industry_name")
	private String industryName;
	
	public Industry() {
		// TODO Auto-generated constructor stub
	}
	

	public Industry(int industryId, String industryName) {
		super();
		this.industryId = industryId;
		this.industryName = industryName;
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


	@Override
	public String toString() {
		return "Industry [industryId=" + industryId + ", industryName=" + industryName + "]";
	}
	
	

}
