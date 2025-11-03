package com.hardy.app.service;

import com.hardy.app.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop()
    {
        System.out.println("addLaptop method called");
    }

    public boolean isGoodForProgramming(Laptop lap){
        return true;
    }
}
