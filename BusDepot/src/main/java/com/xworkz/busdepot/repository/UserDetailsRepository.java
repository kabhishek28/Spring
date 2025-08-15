package com.xworkz.busdepot.repository;

import com.xworkz.busdepot.entity.BusDetailsEntity;

public interface UserDetailsRepository {
    Boolean saveDetailsToDataBase(BusDetailsEntity busDetailsEntity);
}
