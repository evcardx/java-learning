package com.tutorialspoint;

public class HelloWorld2 {

	private String message1;
	private String message2;
	
	public void setMessage1(String message){
	   this.message1  = message;
	}
	public void setMessage2(String message){
	   this.message2  = message;
	}
	public void getMessage1(){
	   System.out.println("Your Message1 : " + message1);
	}
	public void getMessage2(){
	   System.out.println("Your Message2 : " + message2);
	}
}