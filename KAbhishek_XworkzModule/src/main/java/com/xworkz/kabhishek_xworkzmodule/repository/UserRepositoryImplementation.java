package com.xworkz.kabhishek_xworkzmodule.repository;

import com.xworkz.kabhishek_xworkzmodule.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class UserRepositoryImplementation implements UserRepository{

    EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkzModuleUnit");

    @Override
    public String singUpUserToDataBase(UserEntity userEntity) {
        EntityManager  eM = eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();

        try{


            eT.begin();
            eM.persist(userEntity);
            eT.commit();
        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
                return "data not saved";
            }
        }finally {
            eM.close();
        }
        return "data has been Saved";
    }

    @Override
    public UserEntity singInUserToDatabase(String email) {

        EntityManager  eM = eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();
        UserEntity userEntity = new UserEntity();

        try{

            eT.begin();

            Query query = eM.createNamedQuery("getEmailAndPassword");
            query.setParameter("emailBy",email);

            userEntity = (UserEntity) query.getSingleResult();
            System.out.println(userEntity);

            eT.commit();
        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
        }finally {
            eM.close();
        }
        return userEntity;

    }
}
