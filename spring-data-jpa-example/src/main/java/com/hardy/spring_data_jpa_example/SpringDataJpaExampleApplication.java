package com.hardy.spring_data_jpa_example;

import com.hardy.spring_data_jpa_example.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExampleApplication.class, args);

        StudentRepo studentRepo = (StudentRepo) context.getBean(StudentRepo.class);
//        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
//        Student s3 = context.getBean(Student.class);
//
//        s1.setRollNo(101);
//        s1.setName("Jack");
//        s1.setMarks(75);
//
        s2.setRollNo(102);
        s2.setName("kat");
        s2.setMarks(80);
//
//        s3.setRollNo(103);
//        s3.setName("Sam");
//        s3.setMarks(90);
//
//        studentRepo.save(s1);
//        studentRepo.save(s2);
//        studentRepo.save(s3);

//        System.out.println(studentRepo.findAll());
//
//        System.out.println(studentRepo.findById(102));

        System.out.println(studentRepo.findByName("Sam"));

        System.out.println(studentRepo.findByMarksGreaterThan(72));

        studentRepo.delete(s2);
	}

}
