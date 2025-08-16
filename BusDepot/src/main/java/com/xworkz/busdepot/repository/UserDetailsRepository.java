package com.xworkz.busdepot.repository;

import com.xworkz.busdepot.entity.BusDetailsEntity;

import java.util.List;

public interface UserDetailsRepository {
    Boolean saveDetailsToDataBase(BusDetailsEntity busDetailsEntity);

    List<BusDetailsEntity> getAllDataFromDataBase();

    BusDetailsEntity getByIdFormDataBase(int id);

    String upDataPhoneNoInDataBase(int id , long phoneNo);

    String deleteDataByIdInDataBase(int id);

}
