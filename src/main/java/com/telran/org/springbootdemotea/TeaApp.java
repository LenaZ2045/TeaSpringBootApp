package com.telran.org.springbootdemotea;

import com.telran.org.springbootdemotea.controller.TeaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Annotation to start Spring boot Application
public class TeaApp {

    public static void main(String[] args) {
        SpringApplication.run(TeaApp.class, args);
        System.out.println("Hello! Spring Boot Client is Running...");

        // we did not create new object the lines above made it over FrameWork Spring automatically
        // TeaController = new TeaController(); // class new object
        // teaController.printWelcome(); // calling method from this object
    }
}