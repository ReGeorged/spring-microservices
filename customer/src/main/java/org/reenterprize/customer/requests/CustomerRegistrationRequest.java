package org.reenterprize.customer.requests;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email,
        String address

) {

}
