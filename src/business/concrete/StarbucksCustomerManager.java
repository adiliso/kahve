package business.concrete;

import business.Abstract.BaseCustomerManager;
import business.Abstract.ICustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
    private ICustomerCheckService customerCheckService;

    @Override
    public void save(Customer customer) {
        if(customerCheckService.CheckIfRealPerson(customer)){
            super.save(customer);
        }
        else{
            new Exception("Not a valid person");
        }
    }
}
