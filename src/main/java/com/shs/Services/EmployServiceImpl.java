package com.shs.Services;

import com.shs.persistence.model.Employ;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;


@Component
public class EmployServiceImpl {

    @Autowired
    SessionFactory sessionFactory;

    public void addEmploy(Employ employ) {
        if (employ == null) {
            return;
        }
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(employ);
        session.getTransaction().commit();
        session.close();
    }

    public void removeEmployById(long id) {
        Employ employ = null;
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        employ = findEmployById(session, id);
        if (employ != null) {
            session.delete(employ);
        }
        tr.commit();
        session.close();
    }

    public void updateEmploy(long id, Employ employUpdate) {

        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Employ employ = findEmployById(session, id);
        if (employ == null || employUpdate == null) {
            return;
        }
        employ.setName(employUpdate.getName());
        employ.setLastName(employUpdate.getLastName());
        employ.setHireDate(employUpdate.getHireDate());
        employ.setIsWork(employUpdate.isWork());
        employ.setFiredDate(new Date());
        tr.commit();
        session.close();
    }

    public Employ findEmloyById(long id) {
        Employ employ = null;
        Session session = null;
        session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        employ = findEmployById(session, id);
        tr.commit();
        session.close();
        return employ;
    }


    private Employ findEmployById(Session session, long id) {
        Employ employ = null;
        Query query = session.createQuery("from Employ where id = :id");
        query.setLong("id", id);
        employ = (Employ) query.uniqueResult();
        return employ;
    }


    public List<Employ> getAllEmploy() {
        List<Employ> employs = null;
        Session session = null;
        session = sessionFactory.openSession();
        Query query = session.createQuery("from Employ");
        employs = query.list();
        return employs;
    }
}
