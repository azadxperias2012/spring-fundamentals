import com.neotechlabs.repository.CustomerRepository;
import com.neotechlabs.repository.HibernateCustomerRepositoryImpl;
import com.neotechlabs.service.CustomerService;
import com.neotechlabs.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService() {
        CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//        service.setCustomerRepository(getCustomerRepository());
        return service;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }

}
