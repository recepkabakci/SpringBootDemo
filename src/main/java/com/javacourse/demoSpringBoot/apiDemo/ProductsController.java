package com.javacourse.demoSpringBoot.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	@GetMapping("/")
	public String get() {
		return "Laptop";
	}
	@GetMapping("/Products")
	public String get2() {
		return "Computer1";	
	}
}
