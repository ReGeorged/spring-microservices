package org.reenterprize.customer.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.reenterprize.customer.requests.CustomerRegistrationRequest;
import org.reenterprize.customer.services.impl.CustomerServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/customers")
@AllArgsConstructor
public class CustomerController {

    private final CustomerServiceImpl customerService;
    @PostMapping("/add")
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest){
        log.info("new customer registration{}",customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);


    }
}
