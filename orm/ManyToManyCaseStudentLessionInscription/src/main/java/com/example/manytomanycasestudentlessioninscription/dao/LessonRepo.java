package com.example.manytomanycasestudentlessioninscription.dao;

import com.example.manytomanycasestudentlessioninscription.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepo extends JpaRepository<Lesson , Long> {
}
