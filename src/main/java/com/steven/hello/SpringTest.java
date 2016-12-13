package com.steven.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class SpringTest {
	@RequestMapping("helloWord")
	public String say(){
		System.out.println("helloWord");
		return "success";
	}
}
