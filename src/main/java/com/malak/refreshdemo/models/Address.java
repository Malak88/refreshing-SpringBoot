package com.malak.refreshdemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.OneToOne;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Integer id;

    private String rue;

    // @OneToOne
    // @JoinColumn(name = "employee_id")
    // private Employee empleyee;
    
}
