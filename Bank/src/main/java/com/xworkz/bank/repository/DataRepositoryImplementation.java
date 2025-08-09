package com.xworkz.bank.repository;

import com.xworkz.bank.entity.Account;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


public class DataRepositoryImplementation implements DataRepository{

    EntityManagerFactory eMF = null;
    EntityManager eM = null;
    EntityTransaction eT = null;


    @Override
    public void saveData(ArrayList<Account> account ) {
        System.out.println(account);
        try {
            eMF = Persistence.createEntityManagerFactory("BankUnit");
            eM = eMF.createEntityManager();
            eT = eM.getTransaction();


//                eT.begin();
//                eM.persist(account);
//                eT.commit();


            for(Account account1 : account){ eT.begin();
               eM.persist(account1);eT.commit();
            }



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

    @Override
    public List<Account> findAllData() {
        System.out.println("Finding All Data By NamedQuery");
        List<Account> list = new ArrayList<>();
        try {
            eMF = Persistence.createEntityManagerFactory("BankUnit");
            eM = eMF.createEntityManager();
            eT = eM.getTransaction();


            eT.begin();
            Query query = eM.createNamedQuery("getAll");
            list = query.getResultList();
            eT.commit();

        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
        }finally {
            eM.close();
        }
        return list;
    }

    @Override
    public List<Account> findEntityNameByData(String name) {
        System.out.println("Find the Entity by the Name");
        eMF = Persistence.createEntityManagerFactory("BankUnit");
        eM = eMF.createEntityManager();
        eT = eM.getTransaction();

        List<Account> list = new ArrayList<>();
        try{
            eT.begin();
            Query query = eM.createNamedQuery("getEntityByName");
            query.setParameter("bankHolderName", name);
            list = query.getResultList();
            eT.commit();
        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
        }finally {
            eM.close();
        }
        return list;
    }
}
