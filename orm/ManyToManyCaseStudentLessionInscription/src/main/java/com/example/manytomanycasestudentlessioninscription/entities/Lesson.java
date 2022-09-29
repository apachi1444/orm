package com.example.manytomanycasestudentlessioninscription.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int hours;

//    @OneToMany(mappedBy = "lesson" , fetch = FetchType.EAGER)
//    private Collection<Inscription> inscriptions;

    @ManyToMany
    @JoinTable(name = "inscription",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "lesson_id"))
    List<Student> studentList;

}
