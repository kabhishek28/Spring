package com.xworkz.formvalidation.componet;

import com.xworkz.formvalidation.dto.BookDto;
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
public class BookController {
    public BookController() {
        System.out.println("const bookcontroller....");
    }
    @Autowired
    TrainerService trainerService;
    @RequestMapping("book")

    public ModelAndView getBook(@Valid BookDto bookDto , BindingResult bindingResult ,ModelAndView modelAndView) {
        System.out.println(bookDto);

        if (bindingResult.hasErrors()) {

            modelAndView.addObject("errors", bindingResult.getAllErrors());
        }
        trainerService.saveBook(bookDto);
        modelAndView.setViewName("Book");
        return modelAndView;
    }

}
