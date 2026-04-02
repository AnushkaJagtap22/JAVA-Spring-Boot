package com.telusko.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.service.IGreetings;

@SpringBootApplication(scanBasePackages = "com.telusko")
public class GreetingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext container =
            SpringApplication.run(GreetingApplication.class, args);

        IGreetings greet = container.getBean(IGreetings.class);
        System.out.println(greet.generateGreetings("Anushka"));
    }
}