package com.xworkz.kabhishek_xworkzmodule.service;

import com.xworkz.kabhishek_xworkzmodule.dto.UserDTO;
import com.xworkz.kabhishek_xworkzmodule.entity.UserEntity;
import com.xworkz.kabhishek_xworkzmodule.repository.UserRepository;
import com.xworkz.kabhishek_xworkzmodule.repository.UserRepositoryImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    UserRepositoryImplementation userRepositoryImplementation ;

    @Autowired
    PasswordEncoder passwordEncoder;

    UserEntity userEntity = new UserEntity();
    @Override
    public String singUpUser(UserDTO userDTO) {

        userEntity.setUserName(userDTO.getUserName());
        userEntity.setUserEmail(userDTO.getUserEmail());
        userEntity.setUserPhoneNo(userDTO.getUserPhoneNo());
        userEntity.setUserAge(userDTO.getUserAge());
        userEntity.setUserGender(userDTO.getUserGender());
        userEntity.setUserAddress(userDTO.getUserAddress());

        userEntity.setUserPassword(passwordEncoder.encode(userDTO.getUserPassword()));


        return userRepositoryImplementation.singUpUserToDataBase(userEntity);

    }

    @Override
    public boolean singInUser(String email, String password) {
        UserEntity userEntity1 = userRepositoryImplementation.singInUserToDatabase(email);
        String fromDataBasePassword = userEntity1.getUserPassword();



        return  passwordEncoder.matches(password,fromDataBasePassword);
    }
}
