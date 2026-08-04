package com.example.javastudy.controller;

import com.example.javastudy.component.MessageFormatter;
import com.example.javastudy.dto.User;
import com.example.javastudy.service.GreetingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {
    private final GreetingService greetingService;
    private final MessageFormatter messageFormatter;
    @Autowired
    public HelloController(GreetingService greetingService, MessageFormatter messageFormatter) {
        this.greetingService = greetingService;
        this.messageFormatter=messageFormatter;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World i am llb";
    }
    @GetMapping("/hello2")
    public String sayName(@RequestParam("name") String name){
        return "Hello " + name;
    }
    @GetMapping("/hello3")
    public String sayName2(@RequestParam(name = "name",required = false,defaultValue = "world")String name) {
        return "Hello " + name;
    }
    @GetMapping("/hello4")
    public String sayName3(@RequestParam(name = "name",required = false,defaultValue = "world")String name) {
        return greetingService.helloNamesv(name);
    }
    @GetMapping("/hello5/{name}")
    public String sayName4(@PathVariable("name") String name) {
        return greetingService.helloNamesv(name);
    }

    @PostMapping("/hello6")
    public String getName(@RequestBody User user){
        return "Hello "+user.getName()+""+user.getAge();
    }
    @PostMapping("/hello7")
    public User getBody7(@Valid @RequestBody User user){
        return user;
    }
    @RequestMapping(value = "/hello8",method = RequestMethod.GET)
    public String test8(){
        return "hello8 by requestMapping";
    }
    @GetMapping("/hello9")
    public String sayName5(@RequestParam ("name") String name){
        return messageFormatter.formatMessage(name);
    }
}
