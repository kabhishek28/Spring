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

}
