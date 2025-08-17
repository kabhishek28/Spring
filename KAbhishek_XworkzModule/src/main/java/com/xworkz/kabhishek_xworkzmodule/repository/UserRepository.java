package com.xworkz.kabhishek_xworkzmodule.repository;

import com.xworkz.kabhishek_xworkzmodule.entity.UserEntity;

public interface UserRepository {
    public String singUpUserToDataBase(UserEntity userEntity);

    public UserEntity singInUserToDatabase(String email );

}
