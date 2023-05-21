package org.reenterprize.customer.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "set")
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
}
