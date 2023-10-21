package lk.ijse.sample.service;

import lk.ijse.sample.model.CustomerModel;
import lk.ijse.sample.repository.CustomerRepository;

public class CustomerService {

    CustomerRepository customerRepository = new CustomerRepository();
    public boolean saveCustomer(CustomerModel cm) {
        return customerRepository.saveCustomer(cm);
    }
}
