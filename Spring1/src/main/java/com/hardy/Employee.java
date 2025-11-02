package com.hardy;

public class Employee {
    private int age;
    private Salary salary;

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Employee set age " + age);
        this.age = age;
    }

    public Employee() {
        System.out.println("Employee constructor");
    }

    public void learn(){
        System.out.println("Learning...");
    }
}
