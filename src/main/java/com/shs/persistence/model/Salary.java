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
    int earn;

    @Column
    Date dayEarn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    Employ employ;

    public int getEarn() {
        return earn;
    }

    public void setEarn(int earn) {
        this.earn = earn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDayEarn() {
        return dayEarn;
    }

    public void setDayEarn(Date dayEarn) {
        this.dayEarn = dayEarn;
    }

    public Employ getEmploy() {
        return employ;
    }

    public void setEmploy(Employ employ) {
        this.employ = employ;
    }
}
