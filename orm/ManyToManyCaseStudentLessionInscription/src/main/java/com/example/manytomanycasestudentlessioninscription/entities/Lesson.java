package com.example.manytomanycasestudentlessioninscription.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int hours;

    @OneToMany(mappedBy = "lesson" , fetch = FetchType.EAGER)
    private Collection<Inscription> inscriptions;

}
