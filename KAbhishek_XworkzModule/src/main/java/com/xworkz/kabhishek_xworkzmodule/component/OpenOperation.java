package com.xworkz.kabhishek_xworkzmodule.component;

import com.xworkz.kabhishek_xworkzmodule.dto.UserDTO;
import com.xworkz.kabhishek_xworkzmodule.service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.ObjectError;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

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
    public String openSingInPage(@Valid UserDTO userDTO, BindingResult bindingResult, Model model){
//        if(bindingResult.hasErrors()){
//            System.err.println("invalid Data...........");
//            List<ObjectError> objectErrors = bindingResult.getAllErrors();
//            for(ObjectError objectError : objectErrors){
//                System.err.println(objectError.getDefaultMessage());
//            }
//        }
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

    @RequestMapping("findGmailAccount")
    public String openFindAccountPage(){
        return "findAccount";
    }

    @RequestMapping("forgotpassword")
    public String openPasswordPage(String emailName,String forgotPassword, String confirmPassword ) {
        System.out.println(emailName);
        System.out.println(forgotPassword);
        System.out.println(confirmPassword);

        boolean value = userServiceImplementation.upDatePassword(emailName,forgotPassword,confirmPassword);
        if(value == true){
            return "singIn";
        }

        return "notFindAccount";
    }

//    @RequestMapping("afterForgotSingInPage")
//    public String openSingInAfterForgotPassword(String forgotPassword, String confirmPassword){
//        System.out.println("forgotPassword ="+forgotPassword);
//        System.out.println("confirm ="+confirmPassword);
//        return "singIn";
//    }
}
