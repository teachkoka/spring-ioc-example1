package com.bellinfo.component.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Netflix {
    
	@Autowired
	private Movies movie;

    public void display(){
		movie.display();
	}
	
}
