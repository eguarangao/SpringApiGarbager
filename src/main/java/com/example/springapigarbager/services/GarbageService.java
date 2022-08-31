package com.example.springapigarbager.services;

import com.example.springapigarbager.model.Garbage;
import com.example.springapigarbager.repositories.GarbageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class GarbageService {
    @Autowired
    private GarbageRepository garbageRepository;
    //Este metodo permite listar los contenedores
    public List<Garbage> findAll() throws Exception {
        try {
            return garbageRepository.findAll();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
