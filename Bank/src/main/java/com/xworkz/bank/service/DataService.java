package com.xworkz.bank.service;

import com.xworkz.bank.entity.Account;

import java.util.ArrayList;
import java.util.List;

public interface DataService {
    public String saveValidation(ArrayList<Account> accountList);

    public String upDateValidation(Account account,String name);

    public void getValidation(int id);

    public String deleteValidation();
}
