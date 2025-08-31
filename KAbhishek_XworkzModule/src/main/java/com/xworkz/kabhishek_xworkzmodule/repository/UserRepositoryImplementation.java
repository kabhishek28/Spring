package com.xworkz.kabhishek_xworkzmodule.repository;

import com.xworkz.kabhishek_xworkzmodule.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

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
                System.out.println(e.getMessage());
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

            eT.commit();
        }catch (NoResultException e) {
            return null;
        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
        }finally {
            eM.close();
        }
        return userEntity;
    }

    @Override
    public boolean UpDatePassword(String email, String password) {
        EntityManager eM = eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();
        try {
            eT.begin();
           Query query =  eM.createNamedQuery("upDatePasswordByGmail");
           query.setParameter("emailBy",email);
           query.setParameter("passwordBy",password);

            int i = query.executeUpdate();

            eT.commit();
            if(i != 0){
                return true;
            }

        }catch(Exception e) {
            if (eT.isActive()) {
                eT.rollback();
            }
        }finally {
            eM.close();
        }
       return false;
    }

    @Override
    public void upDateTable(UserEntity userEntity) {
        EntityManager eM = eMF.createEntityManager();
        EntityTransaction eT = eM.getTransaction();
        try {
            eT.begin();
            eM.merge(userEntity);
            eT.commit();
        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
        }finally {
            eM.close();
        }

    }

//    @Override
//    public boolean getGmailIsExist(String gmail) {
//        EntityManager  eM = eMF.createEntityManager();
//        EntityTransaction eT = eM.getTransaction();
//
//        System.out.println("////////////");
//        try {
//            eT.begin();
//            Query query = eM.createNamedQuery("findUserByEmail", UserEntity.class);
//            query.setParameter("emailBy" , gmail);
//            List<UserEntity> resultList = query.getResultList();
//
//            if (!resultList.isEmpty()) {
//               return true;
//            }
//            eT.commit();
//
//        }catch (Exception e){
//            if(eT.isActive()){
//                eT.rollback();
//            }
//        }finally {
//            eM.close();
//        }
//        return false;
//    }
//
//    @Override
//    public void setForgotPassword(String email , String encodedPassword) {
//        EntityManager eM = eMF.createEntityManager();
//        EntityTransaction eT = eM.getTransaction();
//        try{
//            eT.begin();
////            eM.createNamedQuery()
//        }
//    }
}
