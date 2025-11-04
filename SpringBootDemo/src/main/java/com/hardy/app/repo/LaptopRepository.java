package com.hardy.app;

import com.hardy.app.model.Laptop;

import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    //this class will be responsible for connecting it to the database
    public void save(Laptop laptop){
        System.out.println("Laptop has saved in database");
    }
}
