package com.tellesbruno.study.trail.controllers;

import com.tellesbruno.study.trail.models.People;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/second")
public class SecondController {

    List <People> peopleList = List.of(
            new People("Null", "Null"),
            new People("Ana", "123"),
            new People("Bruno", "456"),
            new People("Carlos", "789"));

    @GetMapping(path = "/people")
    public People printer(@RequestParam(name = "id", defaultValue = "0") int id){
        return peopleList.get(id);
    }

    @GetMapping(path = "/test")
    public List<String> printer2(){
        List<String> test = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            test.add("Valor "+i*2);
        }
        return test;
    }

    @GetMapping(path = "/people/{id}")
    public People printer3(@PathVariable int id){
        People people = null;
            try {
                people = peopleList.get(id);
            } catch (IndexOutOfBoundsException e) {
                return peopleList.get(0);
            }
        return people;
    }
}
