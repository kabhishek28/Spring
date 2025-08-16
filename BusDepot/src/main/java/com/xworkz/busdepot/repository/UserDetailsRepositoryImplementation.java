package com.xworkz.busdepot.repository;

import com.xworkz.busdepot.entity.BusDetailsEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class UserDetailsRepositoryImplementation implements UserDetailsRepository{

    EntityManagerFactory eMF = Persistence.createEntityManagerFactory("BusDepotUnit");


    @Override
    public Boolean saveDetailsToDataBase(BusDetailsEntity busDetailsEntity) {
        EntityManager eM= eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();
        try{
            eT.begin();
            eM.persist(busDetailsEntity);
            eT.commit();

        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
                return false;
            }
        }finally {
            eM.close();
        }
        return true;

    }

    @Override
    public List<BusDetailsEntity> getAllDataFromDataBase() {
        List<BusDetailsEntity> list = new ArrayList<>();

        EntityManager eM= eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();

        try{
            eT.begin();
            Query query = eM.createNamedQuery("getAllData");
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
    public BusDetailsEntity getByIdFormDataBase(int id) {

        BusDetailsEntity busDetailsEntity = new BusDetailsEntity();
        EntityManager eM= eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();
        try {
            eT.begin();
            Query query = eM.createNamedQuery("getById");
            query.setParameter("person_ID",id);
            busDetailsEntity = (BusDetailsEntity)query.getSingleResult();
        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
        }finally {
            eM.close();
        }

        return busDetailsEntity;
    }

    @Override
    public String upDataPhoneNoInDataBase(int id, long phoneNo) {

        EntityManager eM= eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();
        try{
            eT.begin();
            BusDetailsEntity busDetailsEntity = eM.find(BusDetailsEntity.class,id);
            busDetailsEntity.setPersonPhoneNumber(phoneNo);
            eT.commit();
        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
        }finally {
            eM.close();
        }
        return "your Data has ben updated";
    }

    @Override
    public String deleteDataByIdInDataBase(int id) {

        EntityManager eM= eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();
        try {
            eT.begin();
            BusDetailsEntity busDetailsEntity = eM.find(BusDetailsEntity.class,id);
            eM.remove(busDetailsEntity);
            eT.commit();
        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
        }finally {
            eM.close();
        }
        return "Your Data has Deleted";
    }

    @Override
    public List<String> getGmailByGmailByDataBase( ) {
        EntityManager eM= eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();
List<String> list = new ArrayList<>();
        try {
            eT.begin();
            Query query = eM.createNamedQuery("getGmailbyGmail");
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
    public BusDetailsEntity getNameAndGmailByDataBase(long phoneNumbre) {

        EntityManager eM= eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();
        BusDetailsEntity busDetailsEntity = new BusDetailsEntity();

        try{
            eT.begin();
            Query query = eM.createNamedQuery("getNameAndEmailByPhoneNumber");
            query.setParameter("phoneNumber" , phoneNumbre );
            Object[] objects = (Object[]) query.getSingleResult();
            busDetailsEntity.setPersonName((String) objects[0]);
            busDetailsEntity.setPersonEmail((String) objects[1]);
            eT.commit();
        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
        }finally {
            eM.close();
        }
        return busDetailsEntity;
    }

    @Override
    public List<String> getNameAgeIsGreaterThan18FromDataBase() {

        List<String> list = new ArrayList<>();
        EntityManager eM= eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();
        try{
            eT.begin();
            Query query = eM.createNamedQuery("getNameAgeIsAbove");
            list = query.getResultList();

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
