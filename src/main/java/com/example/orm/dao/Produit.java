package com.example.orm.dao;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "Prod")
@Entity
// serialize convert the object into a table of bytes via tcp
// we can serialize this object into a xml format

public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reference;

    @Column(name = "design")
    private String designation ;

    private double price;
    private int quantity;
}
