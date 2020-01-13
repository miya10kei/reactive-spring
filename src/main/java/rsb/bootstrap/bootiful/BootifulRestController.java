package rsb.bootstrap.bootiful;

import java.util.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rsb.bootstrap.Customer;
import rsb.bootstrap.CustomerService;

@RestController
public class BootifulRestController {

    private final CustomerService customerService;

    public BootifulRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    Collection<Customer> get() {
        return this.customerService.findAll();
    }
}
