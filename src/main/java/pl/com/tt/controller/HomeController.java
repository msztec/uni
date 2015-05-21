package pl.com.tt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {


@RequestMapping(value = {"/", "home2", "home3"})
public ModelAndView welcome(Model model){

    ModelAndView modelAndView = new ModelAndView("home");
    modelAndView.addObject("welcomeMsg", "our custom welcome message");
    return modelAndView;
}

}
