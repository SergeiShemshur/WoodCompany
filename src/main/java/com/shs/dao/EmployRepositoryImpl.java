package com.shs.dao;

import com.shs.persistence.model.Employ;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@Repository
public class EmployRepositoryImpl implements EmployDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
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
    @Override
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

    @Override
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
        employ.setIsWork(employUpdate.isWorking());
        employ.setFiredDate(new Date());
        tr.commit();
        session.close();
    }

    @Override
    public Employ findEmployById(long id) {
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


    @Override
    public List<Employ> getAllEmploy() {
        List<Employ> employs = null;
        Session session = null;
        Query query=null;

        session = sessionFactory.openSession();
        session.flush();
        session.clear();
        query = session.createQuery("from Employ");
        employs = query.list();
        session.close();
        return employs;
    }
}
