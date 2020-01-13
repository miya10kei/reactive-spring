package rsb.bootstrap.enable;

import java.util.Collection;
import javax.sql.DataSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rsb.bootstrap.BaseCustomerService;
import rsb.bootstrap.Customer;

@Service
@Transactional
public class TransactionCustomerService extends BaseCustomerService {

    public TransactionCustomerService(DataSource ds) {
        super(ds);
    }

    @Override
    public Collection<Customer> save(String... names) {
        return super.save(names);
    }

    @Override
    public Customer findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Collection<Customer> findAll() {
        return super.findAll();
    }
}
