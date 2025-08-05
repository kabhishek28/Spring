package com.xworkz.bank.service;

import com.xworkz.bank.entity.Account;

public interface DataService {
    public String saveValidation(Account account);

    public void upDateValidation();

    public Account getValidation();

    public String deleteValidation();
}
