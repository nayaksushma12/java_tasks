package task3.Services;

import task3.Utility.Customer;

public class CustomerService {
    public int index = 0;
    private Customer[] customers = new Customer[5];

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer){
        customers[index] = customer;
        index++;
    }

}
