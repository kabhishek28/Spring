package com.xworkz.kabhishek_xworkzmodule.repository;

import com.xworkz.kabhishek_xworkzmodule.entity.UserEntity;

public interface UserRepository {
    public String singUpUserToDataBase(UserEntity userEntity);

    public UserEntity singInUserToDatabase(String email );

    public boolean UpDatePassword(String email , String password);

//    public boolean getGmailIsExist(String gmail);
//
//    public void setForgotPassword(String gmail , String encodedPassword);
//

}
