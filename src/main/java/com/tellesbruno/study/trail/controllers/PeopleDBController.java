package com.tellesbruno.study.trail.controllers;


import com.tellesbruno.study.trail.models.PeopleDB;
import com.tellesbruno.study.trail.service.PeopleDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Persistence")
    public class PeopleDBController {

    @Autowired
    PeopleDBService peopleDBService;

    @GetMapping("/PeopleDB")
    public List<PeopleDB> getAllPeopleDB(){
        return peopleDBService.getAllPeopleDB();
    }

    @GetMapping("/PeopleDB/{id}")
    public PeopleDB getPeopleDB(@PathVariable("id") int id){
        return peopleDBService.getPeopleDB(id);
    }

    @DeleteMapping("/PeopleDB/{id}")
    public void deletePeopleDB(@PathVariable("id") int id){
        peopleDBService.deletePeopleDB(id);
    }

    @PostMapping()
    public void addPeopleDB(@RequestBody PeopleDB peopleDB){
        peopleDBService.addPeopleDB(peopleDB);
    }

}
