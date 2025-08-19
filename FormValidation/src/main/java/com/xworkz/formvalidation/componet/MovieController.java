package com.xworkz.formvalidation.componet;


import com.xworkz.formvalidation.dto.MovieDto;
import com.xworkz.formvalidation.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class MovieController {

    public MovieController() {
        System.out.println("const moviecontroller....");
    }
    @Autowired
    TrainerService trainerService;
    @RequestMapping("movie")
    public ModelAndView getMovie(@Valid MovieDto movieDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getAllErrors());
        }
        trainerService.saveMovie(movieDto);
        modelAndView.setViewName("Movie");
        return modelAndView;
    }
}
