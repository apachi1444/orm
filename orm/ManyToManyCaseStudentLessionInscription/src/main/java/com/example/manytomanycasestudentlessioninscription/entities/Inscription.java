package com.example.manytomanycasestudentlessioninscription.entities;

import com.fasterxml.jackson.databind.DatabindException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inscription {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateInscription;
    private double score;

    @ManyToOne
    private Student student;
    @ManyToOne
    private Lesson lesson;



}
