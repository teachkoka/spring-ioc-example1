package com.bellinfo;

import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class PlaneA {

		
	@Autowired
	@Qualifier(value="e1")
	private PlaneEngine engine;
	
	

	public void display(){
	     
		System.out.println("Autowired engine details: "+engine);
	}

	
}




