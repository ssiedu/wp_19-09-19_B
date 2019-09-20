package com.ssi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("hello")
	public void test(){
		System.out.println("Test Success =============?????????????");
	}
	
}
