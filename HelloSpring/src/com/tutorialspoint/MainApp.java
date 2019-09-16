package com.tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
	   ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//	   ApplicationContext context = new FileSystemXmlApplicationContext("src/Beans.xml");
//	   HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//	   obj.getMessage();
	   
	   HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
	   objA.setMessage("I'm object A");
	   objA.getMessage();
	   HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
	   objB.getMessage();
	   
	}
}
