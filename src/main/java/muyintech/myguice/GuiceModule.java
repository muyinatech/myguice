package muyintech.myguice;

import com.google.inject.AbstractModule;
import muyintech.myguice.service.CustomerDao;
import muyintech.myguice.service.CustomerDaoImpl;
import muyintech.myguice.service.CustomerService;
import muyintech.myguice.service.CustomerServiceImpl;

public class GuiceModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(CustomerDao.class).to(CustomerDaoImpl.class);
    bind(CustomerService.class).to(CustomerServiceImpl.class);
  }
}
