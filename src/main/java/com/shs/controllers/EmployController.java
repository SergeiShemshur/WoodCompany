package com.shs.controllers;


import com.shs.dao.EmployRepositoryImpl;
import com.shs.persistence.model.Employ;
import com.shs.persistence.model.Salary;
import com.shs.services.EmployJsonService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value = "add",method = RequestMethod.GET)
    public  @ResponseBody String add(){


        Salary salary =new Salary();
        salary.setDayEarn(new Date());
        salary.setEarn(444);
        Employ employ = new Employ();
        employ.setName("Valeraboomboom");
        employ.setLastName("dorda");
        employ.setFiredDate(new Date());
        employ.setHireDate(new Date());
        employ.setIsWork(true);
        employ.getSalaries().add(salary);
        employ.getSalaries().add(new Salary());
        salary.setEmploy(employ);
        employRepository.addEmploy(employ);

/*        session.save(employ);
        session.save(salary);
        session.getTransaction().commit();
        session.flush();
        session.clear();
        session.close();*/


        return "ok";

    }

}
