package com.caps.demo.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("/CarConfig.xml");
		
		Car c = ctx.getBean("car", Car.class);
		System.out.println(c);
	}

}
