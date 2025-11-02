package com.hardy.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
        System.out.println("Hello world");
        //here below this object isn't created by us its created by Spring which is known as bean
        Student obj = context.getBean(Student.class);
        obj.studentsSays();

        //so we can get another object
        Student obj2 = context.getBean(Student.class);


	}

}
