package com.xworkz.blogslinks.component;


import com.xworkz.blogslinks.dto.SoapDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Soap {
    Soap(){
        System.out.println("Const of Soap....");
    }

//    @RequestMapping("/checkSoap")
//    public String getSoapMessage(SoapDTO soapDTO){
//        System.out.println("Soap is Available.....");
//        System.out.println("Soap Brand: " + soapDTO.getSoapBrand());
//        System.out.println("Soap Price: " + soapDTO.getSoapPrice());
//        System.out.println("Soap Fragrance: " + soapDTO.getSoapFragrance());
//
//        return "result";
//    }

    @RequestMapping("/checkSoap")
    public String getSoap(Model model){
        model.addAttribute("name","Soap");
        return "result";
    }

}
