package com.example.manytomanycasestudentlessioninscription.dao;

import com.example.manytomanycasestudentlessioninscription.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student , Long> {

}
