package com.xworkz.bank.repository;

import com.xworkz.bank.entity.Account;

import java.util.ArrayList;
import java.util.List;

public interface DataRepository {
    public String saveData(ArrayList<Account> accountList);

    public String upDateData(Account account , String name);

    public void getData(int id);

    public String deleteData();
}
