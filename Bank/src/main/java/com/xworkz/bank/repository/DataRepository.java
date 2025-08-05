package com.xworkz.bank.repository;

import com.xworkz.bank.entity.Account;

public interface DataRepository {
    public String saveData(Account account);

    public void upDateData();

    public Account getData();

    public String deleteData();
}
