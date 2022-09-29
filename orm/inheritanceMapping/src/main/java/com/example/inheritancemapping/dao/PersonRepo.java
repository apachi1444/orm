package com.example.inheritancemapping.dao;

import com.example.inheritancemapping.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person , Long> {
}
