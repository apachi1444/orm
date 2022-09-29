package com.example.manytomanycasestudentlessioninscription.entities;

import com.fasterxml.jackson.databind.DatabindException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Inscription {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateInscription;
    private double score;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;



}
