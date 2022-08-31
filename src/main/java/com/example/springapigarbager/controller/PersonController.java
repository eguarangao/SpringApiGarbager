package com.example.springapigarbager.controller;

import com.example.springapigarbager.model.Container;
import com.example.springapigarbager.model.Person;
import com.example.springapigarbager.services.ContainerService;
import com.example.springapigarbager.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public ResponseEntity<List<Person>> getAll()
    {
        try
        {
            return ResponseEntity.ok().body(personService.findAll());
        }
        catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }
    @RequestMapping(value = "{id}")
    public ResponseEntity<Person> findById(@PathVariable("id")int id)
    {
        try
        {
            return ResponseEntity.ok().body(personService.findById(id));
        }
        catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }
    }
}
