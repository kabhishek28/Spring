package com.xworkz.formvalidation.repository;

import com.xworkz.formvalidation.entity.*;

public interface TrainerRepository {


    boolean saveBook(BookEntity entity);
    boolean saveCar(CarEntity entity);
    boolean saveCollege(CollegeEntity entity);
    boolean saveCompany(CompanyEntity entity);
    boolean saveDriver(DriverEntity entity);
    boolean saveEmployee(EmployeeEntity entity);
    boolean saveHotel(HotelEntity entity);
    boolean saveLaptop(LaptopEntity entity);
    boolean saveMobile(MobileEntity entity);
    boolean saveMovie(MovieEntity entity);
    boolean saveMusic(MusicEntity entity);
    boolean savePg(PgEntity entity);
    boolean saveStudent(StudentEntity entity);
    boolean saveWoodland(WoodlandEntity entity);

}
