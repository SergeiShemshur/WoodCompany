package com.shs.persistence.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;


@Entity
@Table(name = "employ")
public class Employ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private long id;
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    String email;
    @Column
    String gender;
    @Column
    private boolean working;
    @Column
    private Date hireDate;
    @Column
    private Date firedDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employ")
    @Cascade(value = CascadeType.ALL)
    @JsonIgnore
    private Set<Salary> salaries = new HashSet<Salary>();

    public Set<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(Set<Salary> salaries) {
        this.salaries = salaries;
    }

    public boolean isWorking() {
        return working;
    }

    public void setIsWork(boolean isWork) {
        this.working = isWork;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getFiredDate() {
        return firedDate;
    }

    public void setFiredDate(Date firedDate) {
        this.firedDate = firedDate;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setWorking(boolean working) {
        this.working = working;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
