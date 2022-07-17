package cl.awakelab.spring0018.model.service;

import cl.awakelab.spring0018.model.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> read();
    public Customer read(int customer_id);


}
