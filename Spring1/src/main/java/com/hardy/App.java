package com.hardy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
         System.out.println( "Hello World!" );
         Employee e = (Employee)context.getBean("employee");
//         e.setAge(22);
         e.learn();
        System.out.println(e.getAge());

//         Salary s = (Salary)context.getBean("salary");
    }
}
