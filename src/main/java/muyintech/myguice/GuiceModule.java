package muyintech.myguice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import muyintech.myguice.service.CustomerDao;
import muyintech.myguice.service.CustomerDaoImpl;
import muyintech.myguice.service.CustomerDb;
import muyintech.myguice.service.CustomerProcessor;
import muyintech.myguice.service.CustomerService;
import muyintech.myguice.service.CustomerServiceImpl;
import muyintech.myguice.service.Processor;

public class GuiceModule extends AbstractModule {

  @Override
  protected void configure() {
    // Linked Bindings
    bind(CustomerDao.class).to(CustomerDaoImpl.class);
    bind(CustomerService.class).to(CustomerServiceImpl.class);

    // Named annotation binding
    bind(Processor.class).annotatedWith(Names.named("customer")).to(CustomerProcessor.class);
  }

  @Provides
  CustomerDb customerDb() {
    return new CustomerDb(5);
  }
}
