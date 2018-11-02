package com.caps.demo.spring.autowiring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.caps.demo.spring.annotations.CarConfig;

@Configuration
@ComponentScan(basePackages = "com.caps.demo.spring.autowiring")
public class Config {

}