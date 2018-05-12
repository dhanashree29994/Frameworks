package com.spring.org;

public class Triangle
{
	/*private String type;
	private int height;
	
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public void getHeight() {
		System.out.println("height is "+height);
	}
	public void getType() {
		System.out.println("Type is "+type);
	}
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public Triangle(int height) {
		this.height = height;
	}

	public Triangle(String type) {
		this.type = type;
	}*/
	private Point a;
	private Point b;
	private Point c;
	
	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public void draw()
	{
		System.out.println("Point A :"+getA().getX()+"  "+getA().getY());
		System.out.println("Point B :"+getB().getX()+"  "+getB().getY());
		System.out.println("Point C :"+getC().getX()+"  "+getC().getY());
	}
}
