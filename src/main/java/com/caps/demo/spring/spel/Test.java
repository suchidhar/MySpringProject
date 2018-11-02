package com.caps.demo.spring.spel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(Config.class);
		
		Data data = ctx.getBean("data",Data.class);
		for(Pencil p: data.getData()) {
			System.out.println(p.getName());
		}
	}
}
