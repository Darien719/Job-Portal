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

import com.jobportal.model.Application;

@Entity
@Table(name = "application_status")
public class ApplicationStatus {

		@Id
		@Column(name = "status_id")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int statusID;

		@Column(name = "status")
		private String status;

		// TODO: change name depending on field name
		@OneToMany(mappedBy = "applicationStatus", fetch = FetchType.LAZY)
		private List<Application> appList = new ArrayList<Application>();
		
		
		public ApplicationStatus() {
			// TODO Auto-generated constructor stub
		}
		
		public ApplicationStatus(int statusID, String status, List<Application> appList) {
			super();
			this.statusID = statusID;
			this.status = status;
			this.appList = appList;
		}
		
		
		public ApplicationStatus(String status, List<Application> appList) {
			super();
			this.status = status;
			this.appList = appList;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<Application> getAppList() {
			return appList;
		}

		public void setAppList(List<Application> appList) {
			this.appList = appList;
		}

		public int getStatusID() {
			return statusID;
		}

		@Override
		public String toString() {
			return "ApplicationStatus [statusID=" + statusID + ", status=" + status + "]";
		}
		
}
