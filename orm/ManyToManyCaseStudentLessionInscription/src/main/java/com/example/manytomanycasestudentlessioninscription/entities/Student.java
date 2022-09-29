package com.example.manytomanycasestudentlessioninscription.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;

//    @OneToMany(mappedBy = "student" , fetch = FetchType.EAGER)
//    private Collection<Inscription> inscriptions;

    @ManyToMany(cascade={CascadeType.ALL}, fetch = FetchType.LAZY,mappedBy = "studentList")
    List<Lesson> lessons;

}
