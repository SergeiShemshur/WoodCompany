package com.shs.persistence.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class EmployInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column
    boolean isWork;

    @Column
    Date hireDate;

    @Column
    Date  firedDate;




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public boolean isWork() {

        return isWork;
    }

    public void setIsWork(boolean isWork) {
        this.isWork = isWork;
    }
    public Date getFiredDate() {
        return firedDate;
    }

    public void setFiredDate(Date firedDate) {
        this.firedDate = firedDate;
    }
}
