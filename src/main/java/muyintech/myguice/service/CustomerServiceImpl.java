package muyintech.myguice.service;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import muyintech.myguice.model.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

  private final CustomerDao customerDao;
  private final Processor processor;

  @Inject
  public CustomerServiceImpl(CustomerDao customerDao, @Named("customer") Processor processor) {
    this.customerDao = customerDao;
    this.processor = processor;
  }

  @Override
  public List<Customer> getCustomers() {
    processor.process();
    return customerDao.findAll();
  }
}
