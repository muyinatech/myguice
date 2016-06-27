package muyintech.myguice.service;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class CustomerDbProvider implements Provider<CustomerDb> {

  /**
   * Alternative to provides method, for more complex provider code.
   * Not exceptions cannot be thrown from get() method, so they may be wrapper in the
   * RuntimeExceptions - ProvisionException, CreationException.
   */
  private final CustomerDb customerDb;

  @Inject
  public CustomerDbProvider(CustomerDb customerDb) {
    this.customerDb = customerDb;
  }

  public CustomerDb get() {
    return customerDb;
  }
}
