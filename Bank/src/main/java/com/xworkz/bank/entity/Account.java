package com.xworkz.bank.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "account_table")
@NamedQuery(name = "getAll" , query = "select entity from Account entity")
@NamedQuery(name = "getEntityByName" , query = "select entity from Account entity where bank_holder_name =: bankHolderName")
@NamedQuery(name = "getEntityByNameAndPlace" , query = "select entity from Accont entity where bank_holder_name =: bankHolderName and bank_Name =: bankName")



public class Account {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "bank_holder_name")
    private String bankHolderName;

    @Column(name = "account_number")
    private int accountNumber;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_address")
    private String bankAddress;

    @Column(name = "ifsc_number")
    private String ifscCode;


    public Account( String bankHolderName, int accountNumber, String bankName, String bankAddress, String ifscCode) {
        this.bankHolderName = bankHolderName;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.ifscCode = ifscCode;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", bankHolderName='" + bankHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                ", bankName='" + bankName + '\'' +
                ", bankAddress='" + bankAddress + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                '}';
    }
}