package rsb.bootstrap.bootiful;

import javax.sql.DataSource;
import org.springframework.stereotype.Service;
import rsb.bootstrap.enable.TransactionCustomerService;

@Service
public class BootifulCustomerService extends TransactionCustomerService {

    BootifulCustomerService(DataSource ds) {
        super(ds);
    }
}
