package com.hardy.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    private Laptop laptop;
    public void studentsSays(){
        System.out.println("Student says hiiii!!!");
        laptop.compile();
    }
}
