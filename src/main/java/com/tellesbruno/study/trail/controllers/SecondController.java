package com.tellesbruno.study.trail.controllers;

import com.tellesbruno.study.trail.models.People;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/second")
public class SecondController {
    @GetMapping(path = "/people")
    public People printer(){
        People people = new People("Ana", "123");
        return people;
    }

    @GetMapping(path = "/test")
    public List<String> printer2(){
        List<String> test = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            test.add("Valor "+i*2);
        }
        return test;
    }
}
