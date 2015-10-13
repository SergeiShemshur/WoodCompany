import com.shs.persistence.HibernateUtil;
import com.shs.persistence.model.EmployInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.hibernate.Query;
import java.util.Date;


public class EmployInfoTest {



    SessionFactory factory;

    @BeforeTest
    public void init (){
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        EmployInfo info = new EmployInfo();
        info.setHireDate(new Date());
        info.setIsWork(false);
        session.save(info);
        session.getTransaction().commit();


    }



         @Test
    public void checkInsertion(){

        Session session = factory.openSession();

             Query query = session.createQuery("from EmployInfo where id = :id");
             query.setLong("id",1);
            EmployInfo info = (EmployInfo) query.uniqueResult();
        System.out.println(info.getHireDate().getDate());
            }





}
