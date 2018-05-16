package com.spring.org;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.SystemEnvironmentPropertySource;

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
	/*private Point a;
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
	}*/
	
	/*private List<Point> points;
	private Map<String, String>numbers;

	public Map<String, String> getNumbers() {
		return numbers;
	}

	public void setNumbers(Map<String, String> numbers) {
		this.numbers = numbers;
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}*/
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public ApplicationContext context=null;
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
	public void draw()
	{
		System.out.println(pointA.getX()+"   "+pointA.getY());
		System.out.println(pointB.getX()+"   "+pointB.getY());
		System.out.println(pointC.getX()+"   "+pointC.getY());
	}
	public void myInit()
	{
		System.out.println("In my initialization method");
	}
	public void cleanUp()
	{
		System.out.println("Destroy method");
	}
	
}
