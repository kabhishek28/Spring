package com.xworkz.formvalidation.componet;

import com.xworkz.formvalidation.dto.PgDto;
import com.xworkz.formvalidation.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class PgController {

    public PgController() {
        System.out.println("const pgcontroller....");
    }
    @Autowired
    TrainerService trainerService;
    @RequestMapping("pg")
    public ModelAndView getPg(@Valid PgDto pgDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getAllErrors());
        }
        trainerService.savePg(pgDto);
        modelAndView.setViewName("Pg");
        return modelAndView;
    }
}
