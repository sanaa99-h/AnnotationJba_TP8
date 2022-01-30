import models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import presentation.ClientCONTROLLER;


public class AppliccationTest {



    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ClientCONTROLLER ctrl = (ClientCONTROLLER) context.getBean("idCtrl");
        Client clt = new Client("OMAR");
        ctrl.save(clt);
    }

}
