package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		//Dependency injection with XML
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

		//get the bean
		Student student = context.getBean(Student.class);
		System.out.println(student);
	}


}
