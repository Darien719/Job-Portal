package com.jobportal.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jobportal.model.Application;

@Transactional
@Repository("appDao")
public class ApplicationRepository {
	private SessionFactory sesFact;
	
	public ApplicationRepository() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public ApplicationRepository(SessionFactory sesFact) {
		super();
		this.sesFact = sesFact;
	}
	
	@Transactional
	public void insert(Application transac) {
		sesFact.getCurrentSession().save(transac);
	}

}
