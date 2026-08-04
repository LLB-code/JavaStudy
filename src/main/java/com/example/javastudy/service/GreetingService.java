package com.example.javastudy.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String helloNamesv(String name){
        return "Hello " + name;
    }
}
