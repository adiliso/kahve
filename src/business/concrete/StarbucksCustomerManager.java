package business.concrete;

import business.Abstract.BaseCustomerManager;
import business.Abstract.ICustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerCheckService {

    @Override
    public void save(Customer customer) {
        CheckIfRealPerson(customer);
        super.save(customer);
    }

    @Override
    public void CheckIfRealPerson(Customer customer) {

    }
}
