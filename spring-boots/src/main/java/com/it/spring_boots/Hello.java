package com.it.spring_boots;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/hello")
	String helloWo(){
		return "hello0";
	}
}
