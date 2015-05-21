package pl.com.tt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.com.tt.domain.Address;
import pl.com.tt.domain.Person;
import pl.com.tt.facade.PersonFacade;

import javax.validation.Valid;

/**
 * Created by msztec on 21/10/14.
 */
@Controller
public class PersonController {

    @Autowired
    PersonFacade personFacade;

    @RequestMapping(value = {"/list/people"}, method = RequestMethod.GET)
    public ModelAndView displayListOfPersons(Model model) {
        ModelAndView modelAndView = new ModelAndView("listPeople");
        modelAndView.addObject("persons", personFacade.listPersons());
        return modelAndView;
    }

    @RequestMapping(value = "/add/person", method = RequestMethod.GET)
    public ModelAndView initializeForm(Model model) {
        ModelAndView modelAndView = new ModelAndView("addPerson");
        Person person = new Person();
        person.setName("Enter name");
        person.setSurname("Enter surname");
        person.setAddress(new Address("Enter city name", "Enter street name", "Enter postal code"));
        modelAndView.addObject("person", person);
        return modelAndView;
    }

    @RequestMapping(value = "/add/person", method = RequestMethod.POST)
    public ModelAndView addPerson(@Valid Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("addPerson");
        }
        Person storedPerson = personFacade.createPerson(person);
        ModelAndView modelAndView = new ModelAndView("confirmNewPerson");
        modelAndView.addObject("newPerson", storedPerson);
        return modelAndView;
    }

}
