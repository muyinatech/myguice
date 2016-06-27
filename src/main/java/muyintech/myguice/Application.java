package muyintech.myguice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import muyintech.myguice.model.Customer;
import muyintech.myguice.service.CustomerService;

import java.util.List;

public class Application {
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new GuiceModule());
    CustomerService customerService = injector.getInstance(CustomerService.class);
    List<Customer> customers = customerService.getCustomers();
    System.out.println(customers);
  }
}
