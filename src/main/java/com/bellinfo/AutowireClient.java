package com.bellinfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-autowire.xml");

		PlaneA p4 = context.getBean("p4",PlaneA.class);
		p4.display();
	}

}
