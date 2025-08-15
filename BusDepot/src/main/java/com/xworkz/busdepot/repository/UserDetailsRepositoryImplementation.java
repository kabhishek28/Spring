package com.xworkz.busdepot.repository;

import com.xworkz.busdepot.entity.BusDetailsEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class UserDetailsRepositoryImplementation implements UserDetailsRepository{
    @Override
    public Boolean saveDetailsToDataBase(BusDetailsEntity busDetailsEntity) {
        EntityManagerFactory eMF = Persistence.createEntityManagerFactory("BusDepotUnit");
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
}
