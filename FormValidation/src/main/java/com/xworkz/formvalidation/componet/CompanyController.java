package com.xworkz.formvalidation.componet;

import com.xworkz.formvalidation.dto.CompanyDto;
import com.xworkz.formvalidation.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class CompanyController {
    public CompanyController() {
        System.out.println("const companycontroller....");
    }
    @Autowired
    TrainerService trainerService;
    @RequestMapping("company")
    public ModelAndView getCompany(@Valid CompanyDto companyDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            modelAndView.addObject("errors", errors);
        }
        trainerService.saveCompany(companyDto);
        modelAndView.setViewName("Company");
        return modelAndView;
    }
}
