package com.bellinfo;

import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Plane {
	
	private String planeType;
	
	private Vector<String> parts;
	
	private PlaneEngine planeEngine;
	
	private Properties drivers;
	
	@Qualifier("e2")
	@Autowired
	private PlaneEngine engine;
	
	

	public void setDrivers(Properties drivers) {
		this.drivers = drivers;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}
	
	public void setPlaneEngine(PlaneEngine planeEngine) {
		this.planeEngine = planeEngine;
	}
	
	public void setParts(Vector<String> parts) {
		this.parts = parts;
	}

	public void display(){
		if(parts !=null){
			for(String part:parts){
				System.out.println("part :" + part);
			}
		}
		
		if(drivers !=null){
			Set<Object> set = drivers.keySet();
			for(Object o:set){
				System.out.println("key: "+o.toString() + " value "+drivers.get(o));
			}
		}
		System.out.println("Autowired engine details: "+engine);
		System.out.println("plane type:"+ planeType + " engine : "+planeEngine);
	}

	
}




