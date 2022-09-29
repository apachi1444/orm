package com.example.inheritancemapping.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("STUD")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Person {
    private double note;
}
