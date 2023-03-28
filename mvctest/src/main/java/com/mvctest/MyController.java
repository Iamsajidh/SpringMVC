package com.mvctest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/home")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/about")
	public String aboutus() {
		return "about";
	}
	
	@RequestMapping("/todoApp")
	public String todoapp() {
		return "todoApp";
	}
	
	@RequestMapping("/sajid")
	public String sajid() {
		return "sajid";
	}
} 

