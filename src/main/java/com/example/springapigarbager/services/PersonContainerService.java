package com.example.springapigarbager.services;

import com.example.springapigarbager.model.Container;
import com.example.springapigarbager.model.PersonContainer;
import com.example.springapigarbager.repositories.ContainerRepository;
import com.example.springapigarbager.repositories.PersonContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class PersonContainerService {
    @Autowired
    private PersonContainerRepository personContainerRepository;
    //Este metodo permite listar los contenedores
    public List<PersonContainer> findAll() throws Exception {
        try {
            return personContainerRepository.findAll();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
