package com.example.springapigarbager.services;

import com.example.springapigarbager.model.Container;
import com.example.springapigarbager.model.State;
import com.example.springapigarbager.repositories.ContainerRepository;
import com.example.springapigarbager.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;
    //Este metodo permite listar los contenedores
    public List<State> findAll() throws Exception {
        try {
            return stateRepository.findAll();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
