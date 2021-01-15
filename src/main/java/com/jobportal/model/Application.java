package com.jobportal.model;

import java.sql.Blob;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "application")
public class Application {
	
	@Id
	@Column(name = "application_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int applicationId;
	@Column(name = "applicant_id", nullable=false)
	private int applicantId;
	@Column(name = "posting_id", nullable=false)
	private int postingId;
	@Column(name = "app_date", nullable=false)
	private Timestamp appDate;
	@Column(name = "resume")
	private Blob resume;
	@Column(name = "status", nullable=false)
	private int status;
	
	
	public Application() {
		// TODO Auto-generated constructor stub
	}


	public Application(int applicationId, int applicantId, int postingId, Timestamp appDate, Blob resume, int status) {
		super();
		this.applicationId = applicationId;
		this.applicantId = applicantId;
		this.postingId = postingId;
		this.appDate = appDate;
		this.resume = resume;
		this.status = status;
	}


	public Application(int applicantId, int postingId, Timestamp appDate, Blob resume, int status) {
		super();
		this.applicantId = applicantId;
		this.postingId = postingId;
		this.appDate = appDate;
		this.resume = resume;
		this.status = status;
	}
	
	public Application(int applicationId, int applicantId, int postingId, Timestamp appDate, int status) {
		super();
		this.applicationId = applicationId;
		this.applicantId = applicantId;
		this.postingId = postingId;
		this.appDate = appDate;
		this.status = status;
	}


	public Application(int applicantId, int postingId, Timestamp appDate, int status) {
		super();
		this.applicantId = applicantId;
		this.postingId = postingId;
		this.appDate = appDate;
		this.status = status;
	}


	public int getApplicationId() {
		return applicationId;
	}


	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}


	public int getApplicantId() {
		return applicantId;
	}


	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}


	public int getPostingId() {
		return postingId;
	}


	public void setPostingId(int postingId) {
		this.postingId = postingId;
	}


	public Timestamp getAppDate() {
		return appDate;
	}


	public void setAppDate(Timestamp appDate) {
		this.appDate = appDate;
	}


	public Blob getResume() {
		return resume;
	}


	public void setResume(Blob resume) {
		this.resume = resume;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", applicantId=" + applicantId + ", postingId="
				+ postingId + ", appDate=" + appDate + ", resume=" + resume + ", status=" + status + "]";
	}
	
	
	
	
	
	

}
