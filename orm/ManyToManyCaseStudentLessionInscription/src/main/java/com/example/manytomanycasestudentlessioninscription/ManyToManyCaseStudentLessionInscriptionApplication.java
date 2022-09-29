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

import javax.xml.crypto.Data;
import java.util.Date;

@SpringBootApplication
public class ManyToManyCaseStudentLessionInscriptionApplication implements CommandLineRunner {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    LessonRepo lessonRepo;

    @Autowired
    InscriptionRepo inscriptionRepo;

    public static void main(String[] args) {
        SpringApplication.run(ManyToManyCaseStudentLessionInscriptionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        studentRepo.save(new Student(null, "Jaoua", "Yessine", null));
        studentRepo.save(new Student(null, "Jaoua", "Ahmed", null));

        lessonRepo.save(new Lesson(null, "Math", 40, null));
        lessonRepo.save(new Lesson(null, "Phy", 80, null));

        Lesson lesson = lessonRepo.findById(1L).get();
        Student student = studentRepo.findById(1l).get();
        Lesson lesson2 = lessonRepo.findById(2L).get();
        Student student2 = studentRepo.findById(2l).get();

        inscriptionRepo.save(new Inscription(null, new Date(), 14, student, lesson));
        System.out.println(lesson);

        inscriptionRepo.findByLesson(lesson).forEach(et -> System.out.println(et));


    }

}
