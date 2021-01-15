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
@Table(name = "Location")
public class Location {
	@Id
	@Column(name = "location_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int locationId;
	
	@Column(name = "location_name")
	private String locationName;
	
	//@OneToMany(mappedBy = "locationId", fetch = FetchType.LAZY)
	private List <JobPosting> jobList = new ArrayList<>();
	
	public Location() {
		// TODO Auto-generated constructor stub
	}

	public Location(int locationId, String locationName) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
	}

	public Location(int locationId, String locationName, List<JobPosting> jobList) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.jobList = jobList;
	}

	public Location(String locationName, List<JobPosting> jobList) {
		super();
		this.locationName = locationName;
		this.jobList = jobList;
	}

	public int getLocationId() {
		return locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public List<JobPosting> getJobList() {
		return jobList;
	}

	public void setJobList(List<JobPosting> jobList) {
		this.jobList = jobList;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName=" + locationName + ", jobList=" + jobList + "]";
	}
}