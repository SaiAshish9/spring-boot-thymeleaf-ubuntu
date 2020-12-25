package com.springbootubuntu.demo.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class test {
   
	@GetMapping("/")
	public String sayHi() {
		return ""+ LocalDateTime.now();
	}
	
}
