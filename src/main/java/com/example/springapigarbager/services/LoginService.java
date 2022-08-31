package com.example.springapigarbager.services;

import com.example.springapigarbager.model.Container;
import com.example.springapigarbager.model.Login;
import com.example.springapigarbager.repositories.ContainerRepository;
import com.example.springapigarbager.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;
    //Este metodo permite listar los contenedores
    public List<Login> findAll() throws Exception {
        try {
            return loginRepository.findAll();
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
