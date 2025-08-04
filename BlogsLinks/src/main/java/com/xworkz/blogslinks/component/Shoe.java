package com.xworkz.blogslinks.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Shoe {
    Shoe(){
        System.out.println("Const Shoe........");
    }

    @RequestMapping("/checkShoe")
    public String checkShoe(){
        System.out.println("Shoe Only for Men's");
        return "shoe.jsp";
    }
}
