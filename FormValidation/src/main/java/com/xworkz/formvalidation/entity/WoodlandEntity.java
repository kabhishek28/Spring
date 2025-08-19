package com.xworkz.formvalidation.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "woodland")
public class WoodlandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "owner")
    private String owner;

    @Column(name = "area")
    private String area;

    @Column(name = "type")
    private String type;

    @Column(name = "contact")
    private String contact;

    @Column(name = "facilities")
    private String facilities;
}
