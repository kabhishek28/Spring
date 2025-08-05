package com.xworkz.bank.repository;

import com.xworkz.bank.entity.Account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DataRepositoryImplementation implements DataRepository{

    EntityManagerFactory eMF = null;
    EntityManager eM = null;
    EntityTransaction eT = null;


    @Override
    public String saveData(Account account) {

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
                eT.commit();
            }
        }finally {
            eM.close();
        }

        return "Data has been Store in DataBase........";
    }

    @Override
    public void upDateData() {

    }

    @Override
    public Account getData() {
        return null;
    }

    @Override
    public String deleteData() {
        return "";
    }
}
