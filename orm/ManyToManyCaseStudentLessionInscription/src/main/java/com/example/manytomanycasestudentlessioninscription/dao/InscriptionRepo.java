package com.example.manytomanycasestudentlessioninscription.dao;

import com.example.manytomanycasestudentlessioninscription.entities.Inscription;
import com.example.manytomanycasestudentlessioninscription.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InscriptionRepo extends JpaRepository<Inscription , Long> {
    List<Inscription> findByLesson(Lesson lesson);
}
