package com.dev.core.java;

public class Job_Main {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Suchismita");
		p.setAge(23);
		System.out.println(p);
		
		SoftwareDeveloper dev=new SoftwareDeveloper();
		SoftwareTester test=new SoftwareTester();
		
		p.setJob(dev);
		p.doJob();
	}

}
