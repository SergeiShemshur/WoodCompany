package com.shs.dao;


import com.shs.persistence.model.Employ;

import java.util.List;

public interface EmployDao {

    public void addEmploy(Employ employ);
    public void removeEmployById(long id);
    public void updateEmploy(long id, Employ employUpdate);
    public Employ findEmployById(long id);
    public List<Employ> getAllEmploy();


}
