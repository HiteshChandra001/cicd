package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.AppService;

@RestController
@RequestMapping("/api")
public class AppController {

    private final AppService appService;

    public AppController(AppService appService){
        this.appService = appService;
    }

    @GetMapping("/hello")
    public String hello(){
        return appService.hello();
    }

}
