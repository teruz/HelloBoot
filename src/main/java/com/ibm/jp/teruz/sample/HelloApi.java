package com.ibm.jp.teruz.sample;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {
	
	@RequestMapping(path = "/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello, " + name + "!";
	}

}
