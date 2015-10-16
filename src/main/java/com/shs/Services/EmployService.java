package com.shs.Services;

import com.shs.persistence.model.Employ;


public interface EmployService {

    void addEmploy(Employ employ);
    public void removeEmployById(long id);
    void updateEmploy(long id);
    Employ getEmploy(long id);


}
