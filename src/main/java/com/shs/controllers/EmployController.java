package com.shs.controllers;


import com.shs.dao.EmployRepositoryImpl;
import com.shs.persistence.model.Employ;
import com.shs.persistence.model.Salary;
import com.shs.services.EmployJsonService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


/*
*
*
*/
@Controller
public class EmployController {


    @Autowired
    EmployJsonService employJsonService;
    @Autowired
    EmployRepositoryImpl employRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getEmployAppPage() {
        return "employ";
    }

    @RequestMapping(value = "/employs", method = RequestMethod.GET)
    public @ResponseBody String getEmployList() {
        return employJsonService.getAllEmployJson();
    }

    @RequestMapping(value = "/partials/employAdd",method = RequestMethod.GET)
    public String addEmploy(){
        return "partials/employAdd";
    }

    @RequestMapping(value ="/partials/employInfo")
    public String getEmployInfo(){
        return "partials/employInfo";
    }

    @RequestMapping("employ/show/{id}")
    public @ResponseBody String getEmployById(@PathVariable("id")long id){
        return employJsonService.getEmployByIdJson(id);
    }

}
