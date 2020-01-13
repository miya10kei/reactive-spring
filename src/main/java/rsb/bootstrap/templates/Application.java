package rsb.bootstrap.templates;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.support.TransactionTemplate;
import rsb.bootstrap.DataSourceUtils;
import rsb.bootstrap.Demo;

public class Application {

    public static void main(String[] args) {
        var dataSource = new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2).build();
        var initializedDataSource = DataSourceUtils.initializeDdl(dataSource);
        var dsTxManager = new DataSourceTransactionManager(initializedDataSource);
        TransactionTemplate tt = new TransactionTemplate(dsTxManager);

        var customerService = new TransactionTemplateCustomerService(dataSource, tt);
        Demo.workWithCustomerService(Application.class, customerService);
    }
}
