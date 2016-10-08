package org.roka9.spring;

// Repositorio para el curso: https://javabrains.io/courses/spring_core

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {
	
	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		
		// 1. BeanFactory. La f�brica de Beans, forma b�sica de hacerlo.
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		
		// 2. ApplicationContext. Es m�s potente que BeanFactory, ya que engloba la funcionalidad
		// del anterior y a�ade nuevas funciones como modificar los metadatos de los beans. Se
		// usar� el anterior sobre �ste si tenemos un problema de escasez de memoria, por ejemplo 
		// (applets).
		ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
		
		// Tipos de tri�ngulo: Se diferencian en la complejidad de su construcci�n.
		// 1. Tri�ngulo b�sico con inyecci�n de dependencias de tipos primitivos (int, string).
		Triangle basicTriangle = (Triangle) context.getBean("basicTriangle");
		basicTriangle.draw("basicTriangle");

		// 2. Tri�ngulo construido con inyecci�n de dependencias a otros objetos creados tambi�n en spring.
		Triangle pointTriangle = (Triangle) context.getBean("pointTriangle");
		pointTriangle.draw("pointTriangle");

		// 3. Tri�ngulo construido con inyecci�n de dependencias a otros objetos creados tambi�n en spring, con dependencias AdHoc (espec�ficas de este objeto).
		// pointTAH es un alias para pointTriangleAdHoc, se pueden usar ambos nombres. Recomendable usar IDs.
		Triangle pointTriangleAdHoc = (Triangle) context.getBean("pointTAH");
		pointTriangleAdHoc.draw("pointTriangleAdHoc");
		
		// 4. Tri�ngulo construido con inyecci�n de dependencias a otros objetos creados tambi�n en spring, con dependencias en lista.
		Triangle pointTriangleList = (Triangle) context.getBean("pointTriangleList");
		pointTriangleList.draw("pointTriangleList");
		
		// 5. Tri�ngulo construido con inyecci�n de dependencias a otros objetos creados tambi�n en spring, con autowire.
		Triangle pointTriangleAutoWire = (Triangle) context.getBean("pointTriangleAutoWire");
		pointTriangleAutoWire.draw("pointTriangleAutoWire");
		
	}
}
