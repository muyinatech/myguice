package muyintech.myguice.service;

import com.google.inject.Inject;
import muyintech.myguice.model.Customer;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

  private final CustomerDb customerDb;

  @Inject
  public CustomerDaoImpl(CustomerDb customerDb) {
    this.customerDb = customerDb;
  }

  @Override
  public List<Customer> findAll() {
    return customerDb.selectCustomers();
  }
}
