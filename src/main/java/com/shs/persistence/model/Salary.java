package com.shs.persistence.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "salary")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column
    int earnMoney;

    @Column
    Date day;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = true)
    Employ employ;

    public int getEarnMoney() {
        return earnMoney;
    }

    public void setEarnMoney(int earnMoney) {
        this.earnMoney = earnMoney;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Employ getEmploy() {
        return employ;
    }

    public void setEmploy(Employ employ) {
        this.employ = employ;
    }
}
