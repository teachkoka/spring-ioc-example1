package com.bellinfo.component.test;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.stereotype.Component;


public class Gener {

	private String[] generTypes;

	@Required
	public void setGenerTypes(String[] generTypes) {
		this.generTypes = generTypes;
	  PropertyPlaceholderConfigurer
	}
	
	public void display(){
		System.out.println(generTypes.toString());
	
	}
	
	
	
	
}
