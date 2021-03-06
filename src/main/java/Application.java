import com.neotechlabs.service.CustomerService;
import com.neotechlabs.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService service = appContext.getBean("customerService", CustomerService.class);

        System.out.println("FirstName: " + service.findAll().get(0).getFirstName());
        System.out.println("LastName: " + service.findAll().get(0).getLastName());

    }

}
