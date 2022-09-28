package com.example.orm;

import com.example.orm.dao.Student;
import com.example.orm.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class OrmApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(OrmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        studentRepository.save(new Student(null , "Med" , "ahah@gmail.com" , new Date() , 45));
//        studentRepository.save(new Student(null , "Med" , "ahahsdf@gmail.com" , new Date() , 455));
//
//        studentRepository.findAll().forEach(et -> {
//            System.out.println(et.toString());
//        });


    }
}
