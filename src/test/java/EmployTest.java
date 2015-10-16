import com.shs.persistence.HibernateUtil;
import com.shs.persistence.model.Employ;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.hibernate.Query;
import java.util.Date;
import static org.junit.Assert.*;


public class EmployTest {



    SessionFactory factory;

    @BeforeTest
    public void init (){
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        Employ employ = new Employ();
        employ.setName("Ivan");
        employ.setLastName("dorda");
        employ.setFiredDate(new Date());
        employ.setHireDate(new Date());
        employ.setIsWork(true);
        session.save(employ);
        session.getTransaction().commit();


    }



         @Test
    public void checkInsertion(){

        Session session = factory.openSession();
             Query query = session.createQuery("from Employ where id = :id");
             query.setLong("id", 1);
             Employ employ = (Employ) query.uniqueResult();
              assertEquals(employ.isWork(), true);
            }



}
