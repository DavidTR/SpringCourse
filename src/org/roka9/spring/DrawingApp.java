package org.roka9.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {
	
	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		
		triangle.draw();
	}
}
