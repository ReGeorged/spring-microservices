package org.reenterprize.customer.controllers;

import lombok.extern.slf4j.Slf4j;
import org.reenterprize.customer.requests.CustomerRegistrationRequest;
import org.reenterprize.customer.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final ICustomerService customerService;

    @Autowired
    public CustomerController(ICustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping()
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest){
        log.info("new customer registration{}",customerRegistrationRequest);
        customerService.add(customerRegistrationRequest.toString());


    }
}
