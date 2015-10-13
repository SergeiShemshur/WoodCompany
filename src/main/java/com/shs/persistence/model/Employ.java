package com.shs.persistence.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;


@Entity
public class Employ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String lastName;


    /*


    @OneToOne
    private EmployInfo employInfo;

    public EmployInfo getEmployInfo() {
        return employInfo;
    }

    public void setEmployInfo(EmployInfo employInfo) {
        this.employInfo = employInfo;
    }
*/



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
