package com.dev.core.java;

public class Person {
	private String name;
	private int age;
	private Job job=null;

	public void setJob(Job job) {
		this.job = job;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Job getJob() {
		return job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}

}