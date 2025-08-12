package com.xworkz.blogslinks.component;

import com.xworkz.blogslinks.dto.SocksDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Component
@RequestMapping("/")
public class Socks {
    Socks(){
        System.out.println("Socks const..............");
    }

//    @RequestMapping("/checkSocks")
//    public String checkSocks(SocksDTO socksDTO){
//        System.out.println("Socks is Available....");
//        System.out.println("Socks Brand: " + socksDTO.getSocksBrand());
//        System.out.println("Socks Price: " + socksDTO.getSocksPrice());
//        System.out.println("Socks Size: " + socksDTO.getSocksSize());
//        return "result";
//    }

    @RequestMapping("/checkSocks")
    public String getSocks(Model model){
        model.addAttribute("name","Socks");
        return "result";
    }
}
