package com.shs.controllers;


import com.shs.dao.EmployDaoImpl;
import com.shs.persistence.model.Employ;
import com.shs.services.EmployJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@Controller

public class EmployController {


    @Autowired
    EmployJsonService employJsonService;
    @Autowired
    EmployDaoImpl employRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getEmployAppPage() {
        return "employ";
    }

    @RequestMapping(value = "/employList", method = RequestMethod.GET)
    public
    @ResponseBody
    String getEmployList() {
        return employJsonService.getAllEmployJson();
    }

    @RequestMapping(value = "/partials/{template}")
    public String getEmployInfo(@PathVariable("template") String template) {
        return "partials/" + template;
    }

    @RequestMapping(value = "employ/detail/{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    String getEmployById(@PathVariable("id") long id) {
        return employJsonService.getEmployByIdJson(id);
    }


    @RequestMapping(value = "/employAdd", method = RequestMethod.POST)
    public String addEmploy(@RequestParam(name = "name") String name,
                            @RequestParam(name = "lastName") String lastName,
                            @RequestParam(name = "gender") String gender,
                            @RequestParam(name = "email") String email,
                            @RequestParam(name = "hireDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date hireDate,
                            @RequestParam(name = "working",required = false) String working
    ) {



        Employ newEmploy = new Employ();

        newEmploy.setName(name);
        newEmploy.setLastName(lastName);
        newEmploy.setGender(gender);
        newEmploy.setEmail(email);
        newEmploy.setHireDate(hireDate);
        newEmploy.setIsWork(new Boolean(working));
        employRepository.addEmploy(newEmploy);

        return "redirect:/a";
    }

    @RequestMapping(value = "/removeEmploy", method = RequestMethod.POST)
    public String deleteEmploy(@RequestParam(name = "id") long id) {
        employRepository.removeEmployById(id);
        return "redirect:/a";
    }


}
