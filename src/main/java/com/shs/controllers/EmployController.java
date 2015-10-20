package com.shs.controllers;


import com.shs.dao.EmployRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/*
*
*
*/
@Controller
@RequestMapping("employ")
public class EmployController {

    @Autowired
    EmployRepositoryImpl employService;


    @RequestMapping("/")
    public String getPersonPage(){
        return "employ";
    }








}
