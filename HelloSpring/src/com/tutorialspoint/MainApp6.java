package com.tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		
		helloWorld.setMessage("Hello world");
		helloWorld.getMessage();
		
	}

}
