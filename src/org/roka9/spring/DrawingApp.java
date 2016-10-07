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
		// TODO Auto-generated method stub
		//Triangle triangle = new Triangle();
		
		// 1. BeanFactory. La fábrica de Beans, forma básica de hacerlo.
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		
		// 2. ApplicationContext. Es más potente que BeanFactory, ya que engloba la funcionalidad
		// del anterior y añade nuevas funciones como modificar los metadatos de los beans. Se
		// usará el anterior sobre éste si tenemos un problema de escasez de memoria, por ejemplo 
		// (applets).
		ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		
		triangle.draw();
	}
}
