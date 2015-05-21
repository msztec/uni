package pl.com.tt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pl.com.tt.domain.Address;
import pl.com.tt.domain.Car;
import pl.com.tt.domain.Person;
import pl.com.tt.facade.PersonFacade;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    @Autowired
    PersonFacade personFacade;

    @RequestMapping(value = "/list/car")
    public ModelAndView displayCars() {
        ModelAndView modelAndView = new ModelAndView("listCars");
        modelAndView.addObject("cars", personFacade.listCars());
        return modelAndView;
    }

    //generate form View
    @RequestMapping(value = {"/add/car" },  method = RequestMethod.GET)
    public ModelAndView initlizeForm( Car car) {
        ModelAndView modelAndView = new ModelAndView("addCar");

        modelAndView.addObject("car", car);
//        modelAndView.addObject("msg", test);
        return modelAndView;
    }

    @RequestMapping(value = "/add/car", method = RequestMethod.POST)
    public String addCar(@Valid Car car, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "addCar";
        }
         personFacade.createCar(car);
//        ModelAndView modelAndView = new ModelAndView("confirmNewCar");
        return "redirect:/list/car";
    }

    @ModelAttribute
    public void addHeadr(Model model){
        model.addAttribute("hed", "test");
    }

    @RequestMapping("studentlist")
    public @ResponseBody()
    List<Person> getStudentList() {
        List<Person> studentList = new ArrayList();
        studentList.add(new Person("Meghna", "test", 12, new Address("pce", "a" ,"aa")));
        studentList.add(new Person("Tony", "test", 12, new Address("pce", "a" ,"aa")));
        studentList.add(new Person("Henry", "test", 12, new Address("pce", "a" ,"aa")));


        return studentList;
    }


}
