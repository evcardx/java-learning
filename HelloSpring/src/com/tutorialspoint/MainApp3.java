package com.tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class MainApp3 {
	public static void main(String[] args) {
	   ApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");
	   HelloWorld2 objA = (HelloWorld2) context.getBean("helloWorld");

      objA.getMessage1();
      objA.getMessage2();

      HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
      objB.getMessage1();
      objB.getMessage2();
      objB.getMessage3();
	   
	}
}
