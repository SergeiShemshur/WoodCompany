package ServicesTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shs.persistence.model.Employ;
import com.shs.services.EmployJsonService;
import com.shs.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SpringConfig.class)
public class EmployJsonServiceTest {

    @Autowired
    public EmployJsonService employJsonService;

    @Test
    public void test(){
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Employ employs = (Employ) objectMapper.readValue("{\"id\":1,\"name\":\"Ivan\",\"lastName\":\"dorda\",\"working\":true,\"hireDate\":1445353468000,\"firedDate\":1445353468000}",Employ.class);
            System.out.println(employJsonService.getAllEmployJson());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
