package com.tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
		TextEditor txEditor = (TextEditor) context.getBean("textEditor");
		txEditor.spellCheck();
	}

}
