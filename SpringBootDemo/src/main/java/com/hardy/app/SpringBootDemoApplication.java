package com.hardy.app;

import com.hardy.app.model.Laptop;
import com.hardy.app.model.Student;
import com.hardy.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

        LaptopService service = context.getBean(LaptopService.class);
        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop();
        //here below this object isn't created by us its created by Spring which is known as bean
//        Student obj = context.getBean(Student.class);
//        obj.studentsSays();
//        System.out.println(obj.getAge());
        //so we can get another object
//        Student obj2 = context.getBean(Student.class);
//        obj2.studentsSays();

	}

}
