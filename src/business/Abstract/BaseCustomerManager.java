package business.Abstract;

import business.Abstract.ICustomer;
import entities.Customer;

public class BaseCustomerManager implements ICustomer {
    public void save(Customer customer) {
        System.out.println("Saved to db "+customer.getFirstname());
    }
}
