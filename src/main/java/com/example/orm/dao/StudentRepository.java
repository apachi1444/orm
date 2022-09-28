package com.example.orm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student , Long> {
    List<Student> findByScore(int score);
}
