package daoTest;

import com.shs.persistence.DAO.Person;
import com.shs.persistence.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.impl.SessionImpl;
import org.testng.annotations.Test;

/**
 * Created by sergei on 10/9/15.
 */
public class PersonTest {

    @Test
    public void test(){

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Person person = new Person();
        person.setName("valera");
        person.setLastName("bymbym");
        session.save(person);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
