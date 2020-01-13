package rsb.bootstrap;

import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

@Slf4j
public class Demo {

    public static void workWithCustomerService(Class<?> label, CustomerService customerService) {
        log.info("====================================");
        log.info(label.getName());
        log.info("====================================");

        Stream.of("A", "B", "C").map(customerService::save)
                .forEach(customer -> log.info("saved " + customer.toString()));

        customerService.findAll().forEach(customer -> {
            var customerId = customer.getId();
            var byId = customerService.findById(customerId);
            log.info("found " + byId.toString());
            Assert.notNull(byId, "the resulting customer should not be null");
            Assert.isTrue(byId.equals(customer),
                    "we should be able to query for " + "this result");
        });
    }

}
