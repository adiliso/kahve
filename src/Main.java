import business.Abstract.BaseCustomerManager;
import business.concrete.StarbucksCustomerManager;
import entities.Customer;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager customerManager = new StarbucksCustomerManager();
        Customer customer = new Customer(565,"Adil","Ismayilov","09072005","123");
        customerManager.save(customer);
    }
}