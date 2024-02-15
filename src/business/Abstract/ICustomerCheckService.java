package business.Abstract;

import entities.Customer;

public interface ICustomerCheckService {
    public boolean CheckIfRealPerson(Customer customer);
}
