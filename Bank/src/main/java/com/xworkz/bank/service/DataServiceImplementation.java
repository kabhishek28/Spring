package com.xworkz.bank.service;

import com.xworkz.bank.entity.Account;
import com.xworkz.bank.repository.DataRepository;
import com.xworkz.bank.repository.DataRepositoryImplementation;

public class DataServiceImplementation implements DataService{
    DataRepository dataRepository = new DataRepositoryImplementation();
    @Override
    public String saveValidation(Account account) {
        return dataRepository.saveData(account);
    }

    @Override
    public void upDateValidation() {
        dataRepository.upDateData();
    }

    @Override
    public Account getValidation() {
        dataRepository.getData();
        return null;
    }

    @Override
    public String deleteValidation() {
        dataRepository.deleteData();
        return "data has been deleted form the DataBase";
    }
}
