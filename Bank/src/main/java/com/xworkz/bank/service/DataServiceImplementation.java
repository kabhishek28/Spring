package com.xworkz.bank.service;

import com.xworkz.bank.entity.Account;
import com.xworkz.bank.repository.DataRepository;
import com.xworkz.bank.repository.DataRepositoryImplementation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class DataServiceImplementation implements DataService{

//    @Autowired
//    Account account;
    DataRepository dataRepository = new DataRepositoryImplementation();
    @Override
    public String saveValidation(ArrayList<Account> account ) {

//        BeanUtils.copyProperties(account, dataRepository);
//        System.out.println("dataRepository"+dataRepository);
//        for(Account account1 : account){
//            dataRepository.saveData(account1);
//        }
//        account.stream().forEach(account1 ->  dataRepository.saveData(account1));

        dataRepository.saveData(account);
        return "Data has been Saved";
    }

    @Override
    public String upDateValidation(int id , String name ) {
        return dataRepository.upDateData(id , name);
    }

    @Override
    public String getValidation(int id) {
        return  dataRepository.getData(id);

    }

    @Override
    public String deleteValidation(int id) {
        return dataRepository.deleteData(id);
    }

}
