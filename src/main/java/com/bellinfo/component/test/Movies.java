package com.bellinfo.component.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movies {
	@Autowired
	private Gener gener;
	
	public void display(){
		gener.display();
	}

}
