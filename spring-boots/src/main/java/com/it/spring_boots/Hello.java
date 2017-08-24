package com.it.spring_boots;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/hello")
	String helloWo(){
		return "hello0";
	}
	/*
	 * 默认返回json类型
	 */
	@RequestMapping("/demo")
	Demo getDemo(){
		Demo demo = new Demo();
		demo.setId(10);
		demo.setName("zhangsan-20");
		demo.setCreateTime(new Date());
		demo.setRemark("这是备注remarkaaaaaaaaaa");
		return demo;
	}
}
