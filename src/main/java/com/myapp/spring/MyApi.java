package com.myapp.spring;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ibm")
public class MyApi {

	public MyApi() {
		// TODO Auto-generated constructor stub
	}
	
	// http://localhost:8080/hello
	@GetMapping("/")
	public String sayHello() {
		
		return  "Current Date "+LocalDate.now();
	}
	
	@GetMapping("/hello1/{name}")
	public String sayHello1(@PathVariable("name")  String name) {
		return  "Welcome "+name + " " +LocalTime.now();
	}

	
	@GetMapping("/hello2")
	public String sayHello2(@RequestParam("name")  String name) {
		return  "Welcome "+name + " " +LocalTime.now();
	}
}
