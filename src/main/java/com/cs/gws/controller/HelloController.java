package com.cs.gws.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Gate way service";
	}

	@RequestMapping("/test")
	public String test() {
		return "test";
	}

}