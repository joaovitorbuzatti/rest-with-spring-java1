package com.github.joaovitorbuzatti.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.joaovitorbuzatti.model.Greeting;

@RestController
public class GreetingController {

    public static final String template = "Hello, %s!";
    public final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(
        @RequestParam(value = "name", defaultValue = "Word")String name){
            return new Greeting(counter.incrementAndGet(), String.format(template, name));            
        }

}
