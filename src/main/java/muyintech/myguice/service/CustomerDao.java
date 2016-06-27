package muyintech.myguice.service;

import muyintech.myguice.model.Customer;

import java.util.List;

public interface CustomerDao {
  List<Customer> findAll();
}
