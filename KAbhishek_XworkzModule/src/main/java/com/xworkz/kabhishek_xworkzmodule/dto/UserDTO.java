package com.xworkz.kabhishek_xworkzmodule.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserDTO {


    @NotNull
    @Size(min=3,max = 30,message = "User Name should be between 3 and 30")
    private String userName;


    private String userEmail;
    private long userPhoneNo;
    private int userAge;
    private String userGender;
    private String userAddress;
    private String userPassword;

}
