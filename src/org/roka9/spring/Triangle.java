package org.roka9.spring;

public class Triangle {
	
	private String type;
	
	public void draw() {
		System.out.println("Triangle of type " + getType() + " drawn.");
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
