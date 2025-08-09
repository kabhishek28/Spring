package com.xworkz.bank.service;

import com.xworkz.bank.entity.Account;

import java.util.ArrayList;
import java.util.List;

public interface DataService {
    public String saveValidation(ArrayList<Account> account ) ;

    public String upDateValidation(int id,String name);

    public String getValidation(int id);

    public String deleteValidation(int id);

    public List<Account> findAllValidation();

    public List<Account> findEntityByNameValidation(String name);

    public List<Account> findEntityByNameAndBankBranchValidation(String name , String bankBranch);

}
