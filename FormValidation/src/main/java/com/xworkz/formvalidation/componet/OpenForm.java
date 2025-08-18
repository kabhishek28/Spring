package com.xworkz.formvalidation.componet;

import com.xworkz.formvalidation.dto.SoapDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Component
@RequestMapping
public class OpenForm {
    public OpenForm() {
        System.out.println("OpenForm......................");
    }

    @RequestMapping("soap")
    public String openSoap() {
        return "soap";
    }

    @RequestMapping("checkSoap")
    public ModelAndView getSoap(@Valid SoapDTO bookDto , BindingResult bindingResult , ModelAndView modelAndView) {
        System.out.println(bookDto);

        if (bindingResult.hasErrors()) {

            modelAndView.addObject("errors", bindingResult.getAllErrors());
        }
//        trainerService.saveBook(bookDto);
        modelAndView.setViewName("soap");
        return modelAndView;
    }
}
