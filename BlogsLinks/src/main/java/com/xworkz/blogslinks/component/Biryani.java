package com.xworkz.blogslinks.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Biryani {
    Biryani(){
        System.out.println("Biryani const.........");
    }

    @RequestMapping("/checkBiryani")
    public String checkBiryani(@RequestParam String personName , @RequestParam String hotelName , @RequestParam int numberOfPlate){
        System.out.println("Biryani is Available at Hotel Name :"+ hotelName );
        return "result";
    }
}
