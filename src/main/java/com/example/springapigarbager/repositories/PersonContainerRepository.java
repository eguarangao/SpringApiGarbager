package com.example.springapigarbager.repositories;

import com.example.springapigarbager.model.PersonContainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonContainerRepository extends JpaRepository<PersonContainer,Integer> {
}
