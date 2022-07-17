package cl.awakelab.spring0018.model.service;

import cl.awakelab.spring0018.model.entity.Customer;
import cl.awakelab.spring0018.model.repository.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepo repo;

    public CustomerServiceImpl(CustomerRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Customer> read() {
        return repo.findAll();
    }

    @Override
    public Customer read(int customer_id) {
        return repo.findById(customer_id).orElse(null);
    }
}
