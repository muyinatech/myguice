package muyintech.myguice.service;

import muyintech.myguice.model.Customer;

import java.util.List;

import static java.util.Arrays.asList;

public class CustomerDaoImpl implements CustomerDao {

  @Override
  public List<Customer> findAll() {
    return asList(new Customer("DHA"));
  }
}
