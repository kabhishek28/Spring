package com.xworkz.formvalidation.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "driver")
public class DriverEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "driver_name")
    private String name;

    @Column(name = "driver_age")
    private int age;

    @Column(name = "driver_phone")
    private String phone;

    @Column(name = "driver_email")
    private String email;

    @Column(name = "driver_place")
    private String place;

    @Column(name = "driver_license_number")
    private String licenseNumber;

    @Column(name = "driver_vehicle_type")
    private String vehicleType;
}
