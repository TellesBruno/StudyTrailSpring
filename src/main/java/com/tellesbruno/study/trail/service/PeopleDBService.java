package com.tellesbruno.study.trail.service;

import com.tellesbruno.study.trail.models.PeopleDB;
import com.tellesbruno.study.trail.repository.PeopleDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeopleDBService {
    @Autowired
    PeopleDBRepository peopleDBRepository;

    public List<PeopleDB> getAllPeopleDB() {
        List<PeopleDB> peopleDBs = new ArrayList<>();
        peopleDBRepository.findAll().forEach(peopleDBs::add);
        return peopleDBs;
    }



}
