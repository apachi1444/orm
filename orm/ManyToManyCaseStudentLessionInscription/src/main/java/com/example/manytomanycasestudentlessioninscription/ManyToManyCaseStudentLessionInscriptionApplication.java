package com.example.manytomanycasestudentlessioninscription;

import com.example.manytomanycasestudentlessioninscription.dao.InscriptionRepo;
import com.example.manytomanycasestudentlessioninscription.dao.LessonRepo;
import com.example.manytomanycasestudentlessioninscription.dao.StudentRepo;
import com.example.manytomanycasestudentlessioninscription.entities.Inscription;
import com.example.manytomanycasestudentlessioninscription.entities.Lesson;
import com.example.manytomanycasestudentlessioninscription.entities.Student;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class ManyToManyCaseStudentLessionInscriptionApplication {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    LessonRepo lessonRepo;


    public static void main(String[] args) {
        SpringApplication.run(ManyToManyCaseStudentLessionInscriptionApplication.class, args);
    }

    @Bean
    CommandLineRunner Start(StudentRepo studentRepo, LessonRepo lessonRepo) {
        return args -> {
            Student student = studentRepo.save(new Student(null, "Jaoua", "Yessine", new ArrayList<Lesson>()));
            Student student2 = studentRepo.save(new Student(null, "Jaoua", "Ahmed", new ArrayList<Lesson>()));

            Lesson lesson = lessonRepo.save(new Lesson(null, "Math", 400, new ArrayList<Student>()));
            Lesson lesson2 = lessonRepo.save(new Lesson(null, "Phy", 80, new ArrayList<Student>()));

            student.getLessons().add(lesson);
            student.getLessons().add(lesson2);
            lesson.getStudentList().add(student);
            lesson2.getStudentList().add(student);

            studentRepo.save(student);

            class Parent {
                void display() {
                    System.out.println("parent");
                }
            }

            class Child extends Parent {
                @Override
                void display() {
                    System.out.println("child");
                }

            }

            Parent p;
            Child c = new Child();

            // assign sub class to parent class
            p = c;
            p.display();
            c.display();

        };
    }


}
