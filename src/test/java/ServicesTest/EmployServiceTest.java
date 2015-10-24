package ServicesTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shs.dao.EmployRepositoryImpl;
import com.shs.persistence.model.Employ;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;


public class EmployServiceTest {




       @Test
        public void testJson(){

           Employ employ = new Employ();
           employ.setName("aloha");
           employ.setLastName("aga");
           employ.setFiredDate(new Date());
           ObjectMapper mapper = new ObjectMapper();
           try {
              // mapper.writeValue(System.out,employ);
               System.out.println(mapper.writeValueAsString(employ));
           } catch (IOException e) {
               e.printStackTrace();
           }

       }



}
