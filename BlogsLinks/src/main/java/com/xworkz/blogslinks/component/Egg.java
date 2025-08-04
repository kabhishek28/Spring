package com.xworkz.blogslinks.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Egg {
    Egg(){
        System.out.println("Egg Const.............");
    }

    @RequestMapping("/checkEgg")
    public String chechEgg(){
        System.out.println("EGG is Available......");
        return "egg.jsp";
    }
}
