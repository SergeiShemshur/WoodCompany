package ServicesTest;

import com.shs.Services.EmployService;
import com.shs.Services.EmployServiceImpl;
import com.shs.Services.ServiceConfig;
import com.shs.persistence.model.Employ;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testng.annotations.BeforeTest;
import static org.junit.Assert.*;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= ServiceConfig.class)
public class EmployServiceTest {

    @Autowired
    EmployServiceImpl employService;


    @Test
    public void testService(){

        Employ employ = new Employ();
        employ.setName("dron");
        employ.setLastName("bazyka");
        employ.setFiredDate(new Date());
        employ.setHireDate(new Date());
        employ.setIsWork(true);

        /*employService.addEmploy(employ);
        employService.removeEmployById(3);
        System.out.println(employService.findEmloyById(3));*/
        employService.updateEmploy(1,employ);
    }



}
