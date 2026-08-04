package com.example.javastudy.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageFormatter {
    @Value("${app.greeting.prefix}")
    private String prefix;
    public String formatMessage(String name){
        return prefix + "hello " + name + "!";
    }
}
