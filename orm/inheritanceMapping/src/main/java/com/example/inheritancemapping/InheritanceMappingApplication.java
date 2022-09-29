package com.example.inheritancemapping;

import com.example.inheritancemapping.dao.PersonRepo;
import com.example.inheritancemapping.entities.Professor;
import com.example.inheritancemapping.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InheritanceMappingApplication implements CommandLineRunner {

    @Autowired
    PersonRepo personRepo;

    public static void main(String[] args) {
        SpringApplication.run(InheritanceMappingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setNote(45);
        student.setName("Yessine");
        student.setLastName("Jaoua");

        Professor professor = new Professor();
        professor.setSubject("haha");
        professor.setName("Jaoua");
        professor.setLastName("Jaouaa");

        personRepo.save(student);
        personRepo.save(professor);
    }
}
