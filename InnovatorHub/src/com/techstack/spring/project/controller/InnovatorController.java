package com.techstack.spring.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InnovatorController {
    
    @RequestMapping("/welcome")
    public ModelAndView welcome() {
        
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("msg","Welcome to Innovator Hub");
        return mav;
    }    

}
