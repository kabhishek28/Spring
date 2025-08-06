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
    public void saveData(Account account) {

        try {
            eMF = Persistence.createEntityManagerFactory("BankUnit");
            eM = eMF.createEntityManager();
            eT = eM.getTransaction();


                eT.begin();
                eM.persist(account);
                eT.commit();



        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
        }finally {
            eM.close();
        }
    }

    @Override
    public String upDateData(int id , String name) {

        try {
            eMF = Persistence.createEntityManagerFactory("BankUnit");
            eM = eMF.createEntityManager();
            eT = eM.getTransaction();
            eT.begin();

            Account account = eM.find(Account.class,id);
            account.setBankHolderName(name);
            eT.commit();
        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
        }finally {
            eM.close();
        }
        return "The Bank Holder Name Updated";
    }

    @Override
    public String getData(int id) {
        eMF = Persistence.createEntityManagerFactory("BankUnit");
        eM = eMF.createEntityManager();
        eT = eM.getTransaction();
        eT.begin();
        Account account = eM.find(Account.class,id);
       return account.toString();
    }

    @Override
    public String deleteData(int id) {
        eMF = Persistence.createEntityManagerFactory("BankUnit");
        eM = eMF.createEntityManager();
        eT = eM.getTransaction();
        eT.begin();
        Account account = eM.find(Account.class,id);
        eM.remove(account);
        eT.commit();
        return "THE DATA HAS BEEN REMOVED FROM DATA BASE";
    }
}
