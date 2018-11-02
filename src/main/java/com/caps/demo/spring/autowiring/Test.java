package com.caps.demo.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		int count = context.getBeanDefinitionCount();
		System.out.println("No of Beans: " + count);

		String[] beans = context.getBeanDefinitionNames();
		for (String bean : beans) {
			System.out.println(bean);
		}

/*		Car c = context.getBean("car", Car.class);
		System.out.println(c);
		c.getEngine().run();
		c.getEngine().stop();
*/
		Person p=context.getBean("person",Person.class);
		System.out.println(p);
		p.getJob().doWork();
		
		context.close();
	}
}