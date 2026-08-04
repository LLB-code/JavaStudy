package com.example.javastudy.config;

import com.example.javastudy.component.MessageFormatter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MessageFormatter configTest(){
        return new MessageFormatter();
    }
}
