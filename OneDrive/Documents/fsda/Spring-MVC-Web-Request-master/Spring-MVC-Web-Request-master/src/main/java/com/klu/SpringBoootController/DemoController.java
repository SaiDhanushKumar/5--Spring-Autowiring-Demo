package com.klu.SpringBoootController;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController{
		@PostMapping("/test")
		@ResponseBody
		public String getMessage() {
			return "<h1>hello from DemoController.............</h1>";
		}
		
		@GetMapping("/displayName/{name}")
		@ResponseBody
		public String displayName(@PathVariable String name)
		{
			return "Your name is <h1>"+name+"</h1>";
		}
		@GetMapping("/add/{num1}/{num2}")
		@ResponseBody
		public String add(@PathVariable int num1,@PathVariable int num2) {
			int sum=num1+num2;
			return "the sum of " +num1+ "and" +num2+ "is <h1>" +sum+ "</h1>";
		}
}