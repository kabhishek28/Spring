package com.xworkz.kabhishek_xworkzmodule.service;

import com.xworkz.kabhishek_xworkzmodule.dto.UserDTO;

public interface UserService {
    public String singUpUser(UserDTO userDTO);

    public boolean singInUser(String email,String password);


}
