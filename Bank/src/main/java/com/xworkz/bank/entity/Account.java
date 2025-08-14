package com.xworkz.bank.entity;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor

@ToString
@Entity
@Table(name = "account_table")
@NamedQuery(name = "getAll" , query = "select entity from Account entity")
@NamedQuery(name = "getEntityByName" , query = "select entity from Account entity where bank_holder_name =: bankHolderName")
@NamedQuery(name = "getEntityByNameAndPlace" , query = "select entity from Account entity where bankHolderName =: bankHolderName and bankName =: bankName")
@NamedQuery(name = "getEntityAGreaterThan18" , query = "select entity from Account entity where age > 18")
public class Account {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "bank_holder_name",unique = true )
    private String bankHolderName;

    @Column(name = "account_number")
    private int accountNumber;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_address")
    private String bankAddress;

    @Column(name = "ifsc_number")
    private String ifscCode;

    @Column(name ="age")
    private int age;




    public Account( String bankHolderName, int accountNumber, String bankName, String bankAddress, String ifscCode) {
        this.bankHolderName = bankHolderName;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.ifscCode = ifscCode;
    }

    public Account( String bankHolderName, int accountNumber, String bankName, String bankAddress, String ifscCode, int age) {

        this.bankHolderName = bankHolderName;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.ifscCode = ifscCode;
        this.age = age;

    }


}