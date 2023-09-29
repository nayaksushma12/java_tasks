package task3.Services;

import task3.Utility.Customer;

public class CustomerService {
    public int index = 0;
    public Customer[] customers = new Customer[5];

    public void addCustomer(Customer customer){
        customers[index] = customer;
        index++;
    }

}
