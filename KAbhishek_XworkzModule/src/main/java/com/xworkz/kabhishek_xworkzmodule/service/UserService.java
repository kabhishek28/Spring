package com.xworkz.kabhishek_xworkzmodule.service;

import com.mysql.cj.exceptions.StreamingNotifiable;
import com.xworkz.kabhishek_xworkzmodule.dto.UserDTO;

import javax.swing.text.StyledEditorKit;

public interface UserService {
    public String singUpUser(UserDTO userDTO);

    public boolean singInUser(String email,String password);

    public boolean upDatePassword(String email, String password ,String confirmPassword);

//    public boolean getGmailIsExist(String email);
//
//    public void setPassword(String email ,String password ,String confirmPassword);


}
