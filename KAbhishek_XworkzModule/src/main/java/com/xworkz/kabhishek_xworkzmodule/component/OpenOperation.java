package com.xworkz.kabhishek_xworkzmodule.component;

import com.xworkz.kabhishek_xworkzmodule.dto.UserDTO;
import com.xworkz.kabhishek_xworkzmodule.service.UserService;
import com.xworkz.kabhishek_xworkzmodule.service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class OpenOperation {


    public OpenOperation(){
        System.out.println("OpenOperation..................");
    }

    @Autowired
    UserServiceImplementation userServiceImplementation ;

    @RequestMapping("signUpPage")
    public String openSignUpPage(){
        return "singUp";
    }

    @RequestMapping("singInPage")
    public String openSingInPage(UserDTO userDTO){
        String value = userServiceImplementation.singUpUser(userDTO);
        if(!value.equals("data has been Saved")){
            return "notSingIn";
        }
        return "singIn";
    }

    @RequestMapping("directSignIn")
    public String openDirectSingInPage(){
        return "singIn";
    }

    @RequestMapping("homePage")
    public String openHomePage(String emailName,String passwordName){

        boolean value = userServiceImplementation.singInUser(emailName,passwordName);
        System.out.println("value +++++++++++++++++ " + value );
        if(value == false){
            return "notHome";
        }
        return "home";
    }
}
