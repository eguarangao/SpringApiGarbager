package com.example.springapigarbager.repositories;

import com.example.springapigarbager.model.Garbage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarbageRepository extends JpaRepository<Garbage,Integer> {
}
