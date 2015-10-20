import com.shs.persistence.HibernateUtil;
import com.shs.persistence.model.Employ;
import com.shs.persistence.model.Salary;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.hibernate.Query;
import java.util.Date;
import static org.junit.Assert.*;


public class EmployTest {



    SessionFactory factory;

    @Test
    public void init (){
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        Salary salary =new Salary();
        salary.setDayEarn(new Date());
        salary.setEarn(444);
        Employ employ = new Employ();
        employ.setName("Ivan");
        employ.setLastName("dorda");
        employ.setFiredDate(new Date());
        employ.setHireDate(new Date());
        employ.setIsWork(true);
        employ.getSalaries().add(salary);
        employ.getSalaries().add(new Salary());
        salary.setEmploy(employ);
        session.save(employ);
        session.save(salary);
        session.getTransaction().commit();
    }


        @Test
    public void checkInsertion(){
            factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
             Query query = session.createQuery("from Employ where id = :id");
             query.setLong("id", 1);
             Employ employ = (Employ) query.uniqueResult();
            System.out.println(employ.getSalaries());
            }



}
