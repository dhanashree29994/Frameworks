package com.spring.org;

public class Triangle
{
	private String type;
	private int height;
	
	/*
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setType(String type) {
		this.type = type;
	}*/
	public void getHeight() {
		System.out.println("height is "+height);
	}
	public void getType() {
		System.out.println("Type is "+type);
	}
	public void draw()
	{
		System.out.println("Drawing Triangle");
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
	}
}
