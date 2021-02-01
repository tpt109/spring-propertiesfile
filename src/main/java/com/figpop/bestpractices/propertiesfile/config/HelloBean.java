package com.figpop.bestpractices.propertiesfile.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	
	@Autowired
	private PropertiesWithJavaConfig propertiesWithJavaConfig;
	
	@Autowired
	private DatabaseConfig databaseConfig;
	
	
	@PostConstruct
	void helloStruct() {
		System.out.println("properties hello:" + propertiesWithJavaConfig.hello);
		
		System.out.println("get method env : " + propertiesWithJavaConfig.getHelloEnv());
		
		System.out.println("get database :" + databaseConfig.getUsername());
		
	
	}
}
