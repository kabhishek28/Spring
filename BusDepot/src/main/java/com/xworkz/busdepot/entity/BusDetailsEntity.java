package com.xworkz.busdepot.entity;


import lombok.Data;

import javax.persistence.*;

@Data

@Entity
@Table(name = "bus_details_table")
@NamedQuery(name = "getAllData" , query = "select entity from BusDetailsEntity entity")
@NamedQuery(name = "getById" , query = "select entity from BusDetailsEntity entity where id =: person_ID")
@NamedQuery(name = "getGmailbyGmail" , query = "select entity.personEmail from BusDetailsEntity entity where entity.personEmail like '%@gmail.com'")
@NamedQuery(name = "deleteDataById" , query = "delete from BusDetailsEntity entity where entity.id =: personID")
@NamedQuery(name = "getNameAndEmailByPhoneNumber" , query = "select e.personName , e.personEmail from BusDetailsEntity e where e.personPhoneNumber =: phoneNumber")
@NamedQuery(name = "getNameAgeIsAbove", query = "select e.personName from BusDetailsEntity e where e.personAge > 18")
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
