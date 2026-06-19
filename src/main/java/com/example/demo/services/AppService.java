package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class AppService {

    public AppService(){
        System.out.println("Service Constructor called");
    }

    public String hello(){
        return "Hello1";
    }

}
