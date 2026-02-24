package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =
                SpringApplication.run(SpringDemoApplication.class, args);
		
		System.out.println("Hello from boot applicaton");
		
//		Student s1=new Student();
		Student s1=context.getBean(Student.class);
		s1.build();
	}

}
