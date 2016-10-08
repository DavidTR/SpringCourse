package org.roka9.spring;

import java.util.List;

public class Triangle {
	
	// 1. Inyección de dependencias (valor para type) por parámetro en setter.
	private String type;
	
	// 2. Inyección de dependencias por parámetro a constructor.
	private Integer height;
	
	// 3. Inyección de dependencias de objetos completos, no de tipos primitivos.
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	// 4. Inyección de dependencias de listas de objetos completos.
	private List<Point> points;

	public Integer getHeight() {
		return height;
	}

	// 2. Inyección de dependencias por parámetro a constructor.
	public Triangle (String type) {
		this.type = type;
	}
	
	public Triangle (String type, Integer height) {
		this.type = type;
		this.height = height;
	}
	
	public Triangle (Integer height) {
		this.height = height;
	}
	
	public void draw(String triangleName) {
		
		String pointsInfo = ".";
		
		// Si todos los puntos tienen valor, mostrarlos por pantalla.
		
		// 1. Puntos individuales.
		if (pointA != null && pointB != null && pointC != null) {
			pointsInfo = ", coordinates are: Point A: " + pointA.getX() + " - " + pointA.getY() + 
									      ", Point B: " + pointB.getX() + " - " + pointB.getY() +
									      ", Point C: " + pointC.getX() + " - " + pointC.getY() + ".";
		}
		
		// 2. Lista de puntos.
		if (points != null) {
			pointsInfo = ", coordinates are: Point A: " + points.get(0).getX() + " - " + points.get(0).getY() + 
										  ", Point B: " + points.get(1).getX() + " - " + points.get(1).getY() +
										  ", Point C: " + points.get(2).getX() + " - " + points.get(2).getY() + ".";
		}
		
		System.out.println("The triangle " + triangleName + ", of type " + getType() + " and height " + getHeight() + " has been drawn" + pointsInfo);
		
	}

	public String getType() {
		return type;
	}
	

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	// 1. Inyección de dependencias (valor para type) por parámetro en setter.
/*	public void setType(String type) {
		this.type = type;
	}*/
}
