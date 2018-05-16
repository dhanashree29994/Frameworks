package com.spring.org;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringDemoApp {
	public static void main(String[] args) {
		// using beanfactory
		/*
		 * BeanFactory bf = new XmlBeanFactory(new
		 * FileSystemResource("spring.xml")); Triangle triangle1 = (Triangle)
		 * bf.getBean("triangle"); triangle1.draw();
		 */
		// Using AppliationContext

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring_classPath.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
	}

}
