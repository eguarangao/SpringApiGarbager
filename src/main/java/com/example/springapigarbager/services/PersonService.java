package com.example.springapigarbager.services;

import com.example.springapigarbager.model.Container;
import com.example.springapigarbager.model.Person;
import com.example.springapigarbager.repositories.ContainerRepository;
import com.example.springapigarbager.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    //Este metodo permite listar los contenedores
    public List<Person> findAll() throws Exception {
        try {
            return personRepository.findAll();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    public Person findById(Integer id) throws Exception {
        try {
            Optional<Person> entityOptional = personRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
