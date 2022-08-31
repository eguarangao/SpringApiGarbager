package com.example.springapigarbager.repositories;

import com.example.springapigarbager.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository <Person,Integer>{
}
