package com.shs.controller;


import com.shs.Services.EmployServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployController {

    @Autowired
    EmployServiceImpl employService;


    @RequestMapping("employ")
    public String getPersonPage(){
        return "employ";
    }







}
