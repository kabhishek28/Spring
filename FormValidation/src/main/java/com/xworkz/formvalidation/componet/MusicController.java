package com.xworkz.formvalidation.componet;

import com.xworkz.formvalidation.dto.MusicDto;
import com.xworkz.formvalidation.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class MusicController {

    public MusicController() {
        System.out.println("const musiccontroller....");
    }
    @Autowired
    TrainerService trainerService;
    @RequestMapping("music")
    public ModelAndView getMusic(@Valid MusicDto musicDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getAllErrors());
        }
        trainerService.saveMusic(musicDto);
        modelAndView.setViewName("Music");
        return modelAndView;
    }
}
