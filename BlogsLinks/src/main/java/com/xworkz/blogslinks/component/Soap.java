package com.xworkz.blogslinks.component;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Soap {
    Soap(){
        System.out.println("Const of Soap....");
    }

    @RequestMapping("/checkSoap")
    public String getSoapMessage(){
        System.out.println("Soap is Available.....");
        return "soap.jsp";
    }

}
