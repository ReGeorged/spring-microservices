package org.reenterprize.customer.services.impl;


import lombok.AllArgsConstructor;
import org.reenterprize.customer.models.Customer;
import org.reenterprize.customer.repositories.CustomerRepository;
import org.reenterprize.customer.requests.CustomerRegistrationRequest;
import org.reenterprize.customer.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl   {
    private final CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .setFirstName(request.firstName())
                .setLastName(request.lastName())
                .setEmail(request.email())
                .build();
        // todo: check if email valid
        // todo: check if email not taken
        customerRepository.save(customer);
    }

}
