package com.xworkz.busdepot.component;

import com.xworkz.busdepot.dto.BusDetailsDTO;
import com.xworkz.busdepot.service.UserDetailsServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class BusDetailsSubmitted {

    @Autowired
    UserDetailsServiceImplementation userDetailsServiceImplementation;

    public BusDetailsSubmitted(){
        System.out.println("BusDetailsSubmitted...................");
    }

    @RequestMapping("openSaveDetails")
    public String openSaveDetailsPage(){
        return "saveDetails";
    }
    @RequestMapping("busDetailsSubmitted")
    public String  gotDetails(BusDetailsDTO busDetailsDTO, Model model){
        boolean value = userDetailsServiceImplementation.savePersonDetails(busDetailsDTO);
        if(value == true){
            model.addAttribute("name" , busDetailsDTO.getPersonName());
            return "submittedPage";
        }

        model.addAttribute("name" , busDetailsDTO.getPersonName());
        return "notSubmittedPage";


    }
}
