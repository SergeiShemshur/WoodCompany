package com.shs.dao;

import com.shs.persistence.model.Salary;

import java.util.Set;


public interface SalaryDao {

    Set<Salary> getSalaryByUserId(long id);



}
