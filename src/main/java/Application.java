import com.neotechlabs.service.CustomerService;
import com.neotechlabs.service.CustomerServiceImpl;

public class Application {

    public static void main(String[] args) {

        CustomerService service = new CustomerServiceImpl();

        System.out.println("FirstName: " + service.findAll().get(0).getFirstName());
        System.out.println("LastName: " + service.findAll().get(0).getLastName());

    }

}
