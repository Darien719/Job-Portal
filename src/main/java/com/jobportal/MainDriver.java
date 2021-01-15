package com.jobportal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jobportal.repository.ApplicationRepository;

public class MainDriver {
	
	public static ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
	public static ApplicationRepository appRepo = appCon.getBean("appDao", ApplicationRepository.class);

	public static void main(String[] args) {
	
	}
}
