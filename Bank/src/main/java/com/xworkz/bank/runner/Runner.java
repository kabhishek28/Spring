package com.xworkz.bank.runner;

import com.xworkz.bank.entity.Account;
import com.xworkz.bank.service.DataService;
import com.xworkz.bank.service.DataServiceImplementation;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
//        ArrayList<Account> list = new ArrayList<>();
//        list.add(new Account("Abhi",258741,"SBI","Hospet","SBIFS96321"));
//        list.add(new Account("Kiran", 147852, "HDFC", "Bangalore", "HDFCIN00123"));
//        list.add(new Account("Sneha", 369258, "ICICI", "Mysore", "ICICIN00256"));
//        list.add(new Account("Ravi", 741963, "Axis", "Hubli", "UTIBIN00367"));
//        list.add(new Account("Divya", 852741, "Canara", "Dharwad", "CNRBIN00478"));
//        list.add(new Account("Manoj", 963852, "BOB", "Belgaum", "BARBIN00589"));
//        list.add(new Account("Priya", 123654, "Union Bank", "Davangere", "UBININ00690"));
//        list.add(new Account("Amit", 456789, "Kotak", "Shimoga", "KKBKIN00791"));
//        list.add(new Account("Neha", 789123, "IDFC", "Udupi", "IDFBIN00892"));
//        list.add(new Account("Varun", 321654, "PNB", "Mangalore", "PUNBIN00993"));
//
        Account account = new Account("Divya", 852741, "Canara", "Dharwad", "CNRBIN00478");
        DataService dataService = new DataServiceImplementation();
//        dataService.saveValidation(list);
//


        String update = dataService.upDateValidation(account , "Vinitha");
        System.out.println(update);


//        getting Data by ID brooo

        dataService.getValidation(2);




        
    }
}
