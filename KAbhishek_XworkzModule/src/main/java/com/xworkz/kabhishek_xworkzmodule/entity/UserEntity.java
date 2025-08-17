package com.xworkz.kabhishek_xworkzmodule.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_xworkz_module_table")
@NamedQuery(name = "getEmailAndPassword",query = "select  e from UserEntity e where e.userEmail =: emailBy")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_phoneNo")
    private long userPhoneNo;

    @Column(name = "user_age")
    private int userAge;

    @Column(name = "user_gender")
    private String userGender;

    @Column(name = "user_address")
    private String userAddress;

    @Column(name = "user_password")
    private String userPassword;
}
