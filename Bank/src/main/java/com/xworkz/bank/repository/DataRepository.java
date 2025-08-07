package com.xworkz.bank.repository;

import com.xworkz.bank.entity.Account;

import java.util.ArrayList;
import java.util.List;

public interface DataRepository {
    public void saveData(ArrayList<Account> account );

    public String upDateData(int id , String name);

    public String getData(int id);

    public String deleteData(int id);
}
