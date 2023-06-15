package com.example.demo.controller;

import com.example.demo.entirty.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class Controllers {

    @Autowired
    private PersonService personService;

    @GetMapping("/getAllPersons")
    public List<Person> getAllPersonsData(){
        return personService.getAllPersonsData();
    }
}
