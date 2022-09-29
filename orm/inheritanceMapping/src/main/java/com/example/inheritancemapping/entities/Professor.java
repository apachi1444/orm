package com.example.inheritancemapping.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("PROF")
public class Professor extends Person{
    private String subject;
}
