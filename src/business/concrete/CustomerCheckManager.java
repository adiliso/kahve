package business.concrete;

import business.Abstract.ICustomerCheckService;
import entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
