package com.telran.org.springbootdemotea.controller;

import com.telran.org.springbootdemotea.model.Tea;
import com.telran.org.springbootdemotea.services.TeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

// verbs -GET -POST (these are commands of http protocol)

//http://localhost:8080/teas
@RestController
@RequestMapping("/teas") // specific details to request local host by detailed port
public class TeaController {

    @Autowired
    private TeaService teaService;

//    @GetMapping // //http://localhost:8080/ which type is GET command
//    public String printWelcome() {
//        return "!!! Welcome to the Tea Shop !!!";
//    }

    @GetMapping
    public Set<Tea> getAll() {
        return teaService.getAll();
    }

    // //http://localhost:8080/teas/c91242b8-115f-48dd-bcdb-5a9e12fc7df0
    @GetMapping("/{uuid}") // path variable (read information by specific details)
    public Tea getById(@PathVariable String uuid) {
        return teaService.getById(uuid);
    }

    @PostMapping// record information
    public Tea addTea(@RequestBody Tea tea) {
        return teaService.add(tea);
    }
}