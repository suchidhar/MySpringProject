package com.caps.demo.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
	
	@Bean(name="Suchi") 
	public Person getPerson() {
		Person p=new Person();
		p.setName("Suchismita");
		p.setEmail("suchismita435@gmail.com");
		p.setAge(23);
		p.setJob(getJob());
		return p;
	}
	

	@Bean (name="dev")
	public Job getJob() {
		SoftwareDeveloper dev=new SoftwareDeveloper();
		dev.doJob();
		return dev;
	}
	
}
