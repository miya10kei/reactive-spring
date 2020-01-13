package rsb.bootstrap.basicdi;

import javax.sql.DataSource;
import rsb.bootstrap.BaseCustomerService;

public class DataSourceCustomerService extends BaseCustomerService {

    DataSourceCustomerService(DataSource ds) {
        super(ds);
    }
}
