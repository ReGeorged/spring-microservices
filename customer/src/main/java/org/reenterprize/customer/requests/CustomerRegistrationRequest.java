package org.reenterprize.customer.requests;

public record CustomerRegistrationRequest (
     Long id,
     String name,
     String lastName,
     String email,
     String address

){

}
