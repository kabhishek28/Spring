package com.xworkz.busdepot.entity;


import lombok.Data;

import javax.persistence.*;

@Data

@Entity
@Table(name = "bus_details_table")
public class BusDetailsEntity {

    @Id
    @Column(name = "person_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "person_Name")
    private String personName;

    @Column(name = "person_Email")
    private String personEmail;

    @Column(name = "person_phoneNo")
    private long personPhoneNumber;

    @Column(name = "person_Age")
    private int personAge;

    @Column(name = "person_City")
    private String personCity;

    @Column(name = "person_State")
    private String personState;

}
