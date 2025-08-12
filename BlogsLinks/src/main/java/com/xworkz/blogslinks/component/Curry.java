package com.xworkz.blogslinks.component;

import com.xworkz.blogslinks.dto.CurryDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Curry {
    Curry(){
        System.out.println("Curry Const.......");
    }

//    @RequestMapping("/checkCurry")
//    public String chechCurry(CurryDTO curryDTO){
//        System.out.println("Curry we Don't have......");
//        System.out.println("Curry Name: " + curryDTO.getCurryName());
//        System.out.println("Curry Price: " + curryDTO.getCurryPrice());
//        System.out.println("Curry Quantity: " + curryDTO.getCurryQuantity());
//
//        return "result";
//    }

    @RequestMapping("/checkCurry")
    public String chechCurry(Model model) {
        model.addAttribute("name","Curry");
        return "curry";

    }
}
