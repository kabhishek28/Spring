package com.xworkz.formvalidation.componet;

import com.xworkz.formvalidation.dto.WoodlandDto;
import com.xworkz.formvalidation.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class WoodlandController {

    public WoodlandController() {
        System.out.println("const woodlandcontroller....");
    }
    @Autowired
    TrainerService trainerService;
    @RequestMapping("woodland")
    public ModelAndView getWoodland(@Valid WoodlandDto woodlandDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getAllErrors());
        }
        trainerService.saveWoodland(woodlandDto);
        modelAndView.setViewName("Woodland");
        return modelAndView;
    }
}
