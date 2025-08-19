package com.xworkz.formvalidation.componet;

import com.xworkz.formvalidation.dto.LaptopDto;
import com.xworkz.formvalidation.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class LaptopController {

    public LaptopController() {
        System.out.println("const laptopcontroller....");
    }
    @Autowired
    TrainerService trainerService;
    @RequestMapping("laptop")
    public ModelAndView getLaptop(@Valid LaptopDto laptopDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getAllErrors());
        }
        trainerService.saveLaptop(laptopDto);
        modelAndView.setViewName("Laptop");
        return modelAndView;
    }
}
