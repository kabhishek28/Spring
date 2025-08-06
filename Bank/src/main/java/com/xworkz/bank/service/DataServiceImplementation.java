package com.xworkz.bank.service;

import com.xworkz.bank.entity.Account;
import com.xworkz.bank.repository.DataRepository;
import com.xworkz.bank.repository.DataRepositoryImplementation;

import java.util.ArrayList;
import java.util.List;

public class DataServiceImplementation implements DataService{
    DataRepository dataRepository = new DataRepositoryImplementation();
    @Override
    public String saveValidation(ArrayList<Account> accountList ) {
        return dataRepository.saveData(accountList);
    }

    @Override
    public String upDateValidation(Account account , String name ) {
        return dataRepository.upDateData(account , name);
    }

    @Override
    public void getValidation(int id) {
        dataRepository.getData(id);

    }

    @Override
    public String deleteValidation() {
        dataRepository.deleteData();
        return "data has been deleted form the DataBase";
    }
}
