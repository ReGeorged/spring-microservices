package org.reenterprize.customer.services.impl;


import org.reenterprize.customer.models.Customer;
import org.reenterprize.customer.services.ICustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Override
    public String add(Object arg) {
        Customer customer = Customer.builder()
                .setFirstName("nika")
                .setLastName("giorgadze")
                .setAddress("misamarti")
                .setEmail("randomeiali@emai;.com")
                .build();

        //TODO: implement checks
        return customer.toString();
    }

    @Override
    public String delete() {
        return null;
    }

    @Override
    public String deleteAll() {
        return null;
    }

    @Override
    public String getById() {
        return null;
    }

    @Override
    public String searchByName() {
        return null;
    }

    @Override
    public String getAll() {
        return null;
    }

    @Override
    public String update() {
        return null;
    }
}
