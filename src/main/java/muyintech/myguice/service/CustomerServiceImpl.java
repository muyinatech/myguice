package muyintech.myguice.service;

import com.google.inject.Inject;
import muyintech.myguice.model.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

  private final CustomerDao customerDao;

  @Inject
  public CustomerServiceImpl(CustomerDao customerDao) {
    this.customerDao = customerDao;
  }

  @Override
  public List<Customer> getCustomers() {
    return customerDao.findAll();
  }
}
