package com.caps.demo.spring.autowiring;

import org.springframework.stereotype.Component;

@Component("engine")
public class EngineImpl implements Engine {

	public void run() {
		System.out.println("Engine started");
	}

	public void stop() {
		System.out.println("Engine stopped");
	}

}