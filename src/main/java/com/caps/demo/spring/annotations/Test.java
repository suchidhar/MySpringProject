package com.caps.demo.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		/*
		 * AnnotationConfigApplicationContext ctx=new
		 * AnnotationConfigApplicationContext(CarConfig.class); Car
		 * c=ctx.getBean("car",Car.class); System.out.println(c);
		 */
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(PersonConfig.class);
		Person p=ctx.getBean("Suchi",Person.class);
		System.out.println(p);
		
		
	}

}
