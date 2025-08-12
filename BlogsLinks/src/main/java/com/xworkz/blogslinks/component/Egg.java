package com.xworkz.blogslinks.component;

import com.xworkz.blogslinks.dto.EggDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Egg {
    Egg(){
        System.out.println("Egg Const.............");
    }

//    @RequestMapping("/checkEgg")
//    public String checkEgg(EggDTO eggDTO){
//        System.out.println("EGG is Available......");
//        System.out.println("Egg Type: " + eggDTO.getEggType());
//        System.out.println("Egg Price: " + eggDTO.getEggPrice());
//        System.out.println("Egg Quantity: " + eggDTO.getEggQuantity());
//
//        return "result";
//    }

    @RequestMapping("/checkEgg")
    public String checkEgg(Model model){
        model.addAttribute("name","Egg");
        return "result";
    }
}
