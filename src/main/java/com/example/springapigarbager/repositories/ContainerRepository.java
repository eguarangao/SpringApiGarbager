package com.example.springapigarbager.repositories;

import com.example.springapigarbager.model.Container;
import com.example.springapigarbager.model.Garbage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContainerRepository extends JpaRepository<Container,Integer> {

}
