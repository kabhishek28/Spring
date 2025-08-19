package com.xworkz.formvalidation.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "company")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "ceo")
    private String ceo;

    @Column(name = "industry")
    private String industry;

    @Column(name = "headquarters")
    private String headquarters;

    @Column(name = "employees")
    private int employees;

    @Column(name = "revenue")
    private double revenue;

    @Column(name = "founded")
    private String founded;
}
