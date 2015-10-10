package com.shs.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * Created by sergei on 10/9/15.
 */
@Controller
public class SimpleController {

/*    private static final Logger logger = LogManager.getLogger(SimpleController.class);*/

@RequestMapping(value = "/",method = RequestMethod.GET)
    public String printWelcom(){
  /*  logger.info("mapping to /");*/
    return "index";
    }


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "test";
    }


}
