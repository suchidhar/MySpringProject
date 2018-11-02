package com.caps.demo.spring.annotations;

public class Person {
	private String name;
	private String email;
	private int age;
	private Job job=null;
	
	public void setJob(Job job) {
		this.job=job;
	}
	
	public void doJob() {
		job.doJob();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
	

}
