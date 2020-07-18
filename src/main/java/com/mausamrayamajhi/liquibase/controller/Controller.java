package com.mausamrayamajhi.liquibase.controller;

import com.mausamrayamajhi.liquibase.entity.Person;
import com.mausamrayamajhi.liquibase.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class Controller {

    private final PersonRepository personRepository;

    public Controller(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping("/person")
    public String createPerson(@RequestParam String name){
        personRepository.save(new Person(name,"5.7"));
        return personRepository.findByName(name)+ " saved successful";
    }

    @GetMapping("/person")
    public  List<Person> getAllPerson(){
        return  personRepository.findAll();

    }
}
