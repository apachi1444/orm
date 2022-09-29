package com.example.manytomanycasestudentlessioninscription.dao;

import com.example.manytomanycasestudentlessioninscription.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepo extends JpaRepository<Lesson , Long> {
}
