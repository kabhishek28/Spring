package com.xworkz.blogslinks.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Curry {
    Curry(){
        System.out.println("Curry Const.......");
    }

    @RequestMapping("/checkCurry")
    public String chechCurry(){
        System.out.println("Curry we Don't have......");
        return "curry.jsp";
    }
}
