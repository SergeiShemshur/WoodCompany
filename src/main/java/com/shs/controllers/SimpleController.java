package com.shs.controllers;

import com.shs.dao.EmployDaoImpl;
import com.shs.persistence.model.Employ;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class SimpleController {

    @Autowired
    SessionFactory factory;

/*  private static final Logger log = Logger.getLogger(SimpleController.class);*/

    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public String printWelcom() {
        return "index";
    }

    @RequestMapping(value = "base", method = RequestMethod.GET)
    public String getBase() {
        return "base";
    }


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(Model model) {
        Employ employ = new Employ();

        employ.setName("coco");
        employ.setLastName("ogi");
        employ.setId(55);
        employ.setIsWork(true);

        model.addAttribute(employ);
        return "test";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String testInput(Employ employ) {
        System.out.println(employ.getName());
        return "test";
    }


}
