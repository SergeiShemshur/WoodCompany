package com.shs.controller;

import com.shs.persistence.model.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;


/**
 * Created by sergei on 10/9/15.
 */
@Controller
public class SimpleController {

    @Autowired
    SessionFactory factory;

/*  private static final Logger log = Logger.getLogger(SimpleController.class);*/

        @RequestMapping(value = "/",method = RequestMethod.GET)
    public String printWelcom(){

    return "index";
    }


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(Model model) {
        Person person = new Person();
        person.setLastName("ogi");
        person.setName("coco");
        person.setId(55);
        model.addAttribute(person);
        return "test";
    }

  @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String testInput(Person person){
      System.out.println(person.getName());
        return "test";
    }


}
