package com.bellinfo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
    	
        Car c1 =factory.getBean("c", Car.class);
        Car c2 =(Car)factory.getBean("c");
        Car c3 =factory.getBean("c", Car.class);
        
        c1.display();
        
        System.out.println("********** Using Application Context *****");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Car car = context.getBean("c", Car.class);
        
        car.display();
        
        Car car1 = context.getBean("c1",Car.class);
        
        Plane plane = context.getBean("p1", Plane.class);
        plane.display();
    	       
        Plane plane1 = context.getBean("p2", Plane.class);
        plane1.display();
        
        Plane plane3 = context.getBean("p3", Plane.class);
        plane3.display();
        
    }
}
