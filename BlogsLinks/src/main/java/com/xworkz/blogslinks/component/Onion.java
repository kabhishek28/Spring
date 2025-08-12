package com.xworkz.blogslinks.component;




import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Onion {
    Onion(){
        System.out.println("Onion Const...........");
    }

//    @RequestMapping("/checkOnion")
//    public String checkOnion(OnionDTO onionDTO){
//        System.out.println("Onion is Available.....");
//        System.out.println("Onion Type: " + onionDTO.getOnionType());
//        System.out.println("Onion Price: " + onionDTO.getOnionPrice());
//        System.out.println("Onion Quantity: " + onionDTO.getOnionQuantity());
//
//        return "result";
//    }

    @RequestMapping("/checkOnion")
    public String checkOnion(Model model){
        model.addAttribute("name","Onion");
        return "result";
    }
}
