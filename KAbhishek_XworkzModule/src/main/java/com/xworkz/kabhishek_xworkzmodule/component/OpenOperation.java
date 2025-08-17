package com.xworkz.kabhishek_xworkzmodule.component;

import com.xworkz.kabhishek_xworkzmodule.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class OpenOperation {

    @Autowired
    PasswordEncoder passwordEncoder;
    public OpenOperation(){
        System.out.println("OpenOperation..................");
    }

    @RequestMapping("signUpPage")
    public String openSignUpPage(){
        return "singUp";
    }

    @RequestMapping("singInPage")
    public String openSingInPage(UserDTO userDTO){
        System.out.println(userDTO.getUserName());
        System.out.println(userDTO.getUserPassword());
        String encryptedPassword = passwordEncoder.encode(userDTO.getUserPassword());
        System.out.println(encryptedPassword);
        System.out.println("============================================================================");
        String store =...;
        return "singIn";
    }

    @RequestMapping("directSignIn")
    public String openDirectSingInPage(){
        return "singIn";
    }
}
