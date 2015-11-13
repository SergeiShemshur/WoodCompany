package com.shs.services;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shs.dao.EmployDao;
import com.shs.persistence.model.Employ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployJsonService {

    @Autowired
    EmployDao employDao;


    public String getAllEmployJson() {
        List<Employ> employs = employDao.getAllEmploy();
        System.out.println(employs);
        if (employs == null) {
            return null;
        } else {
            return createJsonFromEmploy(employs);
        }
    }

    public String getEmployByIdJson(long id) {
        Employ employ = employDao.findEmployById(id);
        if (employ == null) {
            return null;
        } else {
            return createJsonFromEmploy(employ);
        }
    }

    private String createJsonFromEmploy(Object employ) {
        ObjectMapper mapper = new ObjectMapper();
        String empoyJson = "";
        try {
            empoyJson = mapper.writeValueAsString(employ);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return empoyJson;
    }
}
