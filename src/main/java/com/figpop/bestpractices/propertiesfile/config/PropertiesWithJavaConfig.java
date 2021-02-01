package com.figpop.bestpractices.propertiesfile.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:foo.properties")
@PropertySource("classpath:bar.properties")
public class PropertiesWithJavaConfig {
	
	@Value( "${hello:hellod_efauult}" )
	public String hello;
	
	
	@Autowired
	private Environment env;
	
	public String getHelloEnv() {
		return env.getProperty("hello");
	}
}
