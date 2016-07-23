package com.baiju.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");

	       HelloBean obj = (HelloBean) context.getBean("helloBean");

	       obj.getMessage();

	}
}
