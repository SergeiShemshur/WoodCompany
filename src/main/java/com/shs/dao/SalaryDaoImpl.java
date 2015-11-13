package com.shs.dao;

import com.shs.persistence.model.Employ;
import com.shs.persistence.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;


public class SalaryDaoImpl implements SalaryDao {

    @Autowired
    EmployDao employDao;


    @Override
    public Set<Salary> getSalaryByUserId(long id) {
        Employ employ = employDao.findEmployById(id);
        return employ.getSalaries();
    }

}
