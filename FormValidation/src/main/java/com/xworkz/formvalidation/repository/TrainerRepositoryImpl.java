package com.xworkz.formvalidation.repository;

import com.xworkz.formvalidation.entity.*;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
@Repository
public class TrainerRepositoryImpl implements TrainerRepository{
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("driverUnit");

     boolean saveEntity(Object entity) {
        EntityManager manager = null;
        EntityTransaction transaction = null;
        try {
            manager = entityManagerFactory.createEntityManager();
            transaction = manager.getTransaction();
            transaction.begin();
            manager.persist(entity);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            if (manager != null) {
                manager.close();
            }
        }
    }

    @Override
    public boolean saveBook(BookEntity entity) {
        return saveEntity(entity);
    }

    @Override
    public boolean saveCar(CarEntity entity) {
        return saveEntity(entity);
    }

    @Override
    public boolean saveCollege(CollegeEntity entity) {
        return saveEntity(entity);
    }

    @Override
    public boolean saveCompany(CompanyEntity entity) {
        return saveEntity(entity);
    }

    @Override
    public boolean saveDriver(DriverEntity entity) {
        return saveEntity(entity);
    }

    @Override
    public boolean saveEmployee(EmployeeEntity entity) {
        return saveEntity(entity);
    }

    @Override
    public boolean saveHotel(HotelEntity entity) {
        return saveEntity(entity);
    }

    @Override
    public boolean saveLaptop(LaptopEntity entity) {
        return saveEntity(entity);
    }

    @Override
    public boolean saveMobile(MobileEntity entity) {
        return saveEntity(entity);
    }

    @Override
    public boolean saveMovie(MovieEntity entity) {
        return saveEntity(entity);
    }

    @Override
    public boolean saveMusic(MusicEntity entity) {
        return saveEntity(entity);
    }

    @Override
    public boolean savePg(PgEntity entity) {
        return saveEntity(entity);
    }

    @Override
    public boolean saveStudent(StudentEntity entity) {
        return saveEntity(entity);
    }

    @Override
    public boolean saveWoodland(WoodlandEntity entity) {
        return saveEntity(entity);
    }
}

