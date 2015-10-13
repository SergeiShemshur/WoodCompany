import com.shs.persistence.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.hibernate.Query;
import java.util.Date;


public class EmployTest {



    SessionFactory factory;

    @BeforeTest
    public void init (){
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        EmployInfo info = new EmployInfo();
        info.setHireDate(new Date());
        info.setIsWork(true);
        session.save(info);
        session.getTransaction().commit();


    }



         @Test
    public void checkInsertion(){

        Session session = factory.openSession();
             Query query = session.createQuery("from EmployInfo where id = :id");
             query.setLong("id", 1);
             EmployInfo info = (EmployInfo) query.uniqueResult();
              assertEquals(info.isWork(),true);

            }





}
