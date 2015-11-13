import com.shs.persistence.HibernateUtil;
import com.shs.persistence.model.Employ;
import com.shs.persistence.model.Salary;
import com.shs.SpringConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import java.util.Date;


/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)*/
public class EmployTest {

    SessionFactory factory;


    @Test
    public void inite (){
        factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        Salary salary =new Salary();
        salary.setDay(new Date());
        salary.setEarnMoney(444);
        Employ employ = new Employ();
        employ.setName("Test555");
        employ.setLastName("dor");
        employ.setFiredDate(new Date());
        employ.setHireDate(new Date());
        employ.setIsWork(true);
        employ.getSalaries().add(salary);
        employ.getSalaries().add(new Salary());
        salary.setEmploy(employ);
        session.save(employ);
        session.save(salary);
        session.getTransaction().commit();
        session.flush();
        session.clear();
        session.close();
    }

/*
    @Autowired
    EmployJsonService employJsonService;

        @Test
    public void checkInsertion(){
      factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            // Query query = session.createQuery("from Employ ");
          employJsonService = new EmployJsonService();

            String a =employJsonService.getAllEmployJson();
            System.out.println(a);

            }

*/


}
