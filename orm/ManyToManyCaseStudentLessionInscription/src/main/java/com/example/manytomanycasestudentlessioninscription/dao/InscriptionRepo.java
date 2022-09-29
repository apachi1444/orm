package com.example.manytomanycasestudentlessioninscription.dao;

import com.example.manytomanycasestudentlessioninscription.entities.Inscription;
import com.example.manytomanycasestudentlessioninscription.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InscriptionRepo extends JpaRepository<Inscription , Long> {
    List<Inscription> findByLesson(Lesson lesson);
}
