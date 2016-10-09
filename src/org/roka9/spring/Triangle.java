package org.roka9.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

// Hay interfaces que nos permiten acceder al contexto ApplicationContext o al nombre del bean en la inicialización del mismo, antes de usar el objeto.
// Sólo es necesario implementar estas interfaces y los métodos necesarios.
public class Triangle implements ApplicationContextAware, BeanNameAware {
	
	private String type;
	private ApplicationContext context = null;
	
	public void draw() {
		System.out.println("Triangle of type " + getType() + " drawn.");
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context = context;
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean called: " + beanName);
		
	}
}
