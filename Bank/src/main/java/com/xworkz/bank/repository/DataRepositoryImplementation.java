package com.xworkz.bank.repository;

import com.xworkz.bank.entity.Account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class DataRepositoryImplementation implements DataRepository{

    EntityManagerFactory eMF = null;
    EntityManager eM = null;
    EntityTransaction eT = null;


    @Override
    public String saveData(ArrayList<Account> accountList) {

        System.out.println(accountList);
        try {
            eMF = Persistence.createEntityManagerFactory("BankUnit");
            eM = eMF.createEntityManager();
            eT = eM.getTransaction();

            for (Account account : accountList){
                eT.begin();
                eM.persist(accountList);
                eT.commit();
            }

        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
        }finally {
            eM.close();
        }

        return "Data has been Store in DataBase........";
    }

    @Override
    public String upDateData(Account account , String name) {

        try {
            eMF = Persistence.createEntityManagerFactory("BankUnit");
            eM = eMF.createEntityManager();
            eT = eM.getTransaction();
            eT.begin();

            Account account1 = account;
//            account1.setAccountNumber(name);

            eT.commit();
        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
        }finally {
            eM.close();
        }
        return "The name Updated";
    }

    @Override
    public void getData(int id) {

    }

    @Override
    public String deleteData() {
        return "";
    }
}
