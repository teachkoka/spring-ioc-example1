package com.bellinfo.component.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentClientTest {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("component-beans.xml");
		Netflix n =appContext.getBean(Netflix.class);
		n.display();

	}

}
