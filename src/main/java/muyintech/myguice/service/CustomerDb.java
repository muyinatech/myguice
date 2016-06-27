package muyintech.myguice.service;

import muyintech.myguice.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDb {

  private final int size;

  public CustomerDb(int size) {
    this.size = size;
  }

  public List<Customer> selectCustomers() {
    List<Customer> customers = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      customers.add(new Customer("Customer " + i));
    }
    return customers;
  }
}
