package org.reenterprize.compliance.controllers;


import lombok.AllArgsConstructor;
import org.reenterprize.compliance.requests.ComplianceRequests;
import org.reenterprize.compliance.services.impl.ComplianceServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/compliance")
@AllArgsConstructor
public class ComplianceController {
    private final ComplianceServiceImpl complianceService;

    @GetMapping(path = "{customerId}")
    public void isCompliant(@PathVariable("customerId") Integer customerId){
        ComplianceRequests complianceRequests  = new ComplianceRequests();
        complianceRequests.setCustomerId(customerId);
        //TODO extract from browser
        complianceService.isCompliant(complianceRequests);
    }


    @PostMapping("/add")
    public void registerNonCompliantCustomer(@RequestBody ComplianceRequests complianceRequests){
        complianceService.addNotCompliant(complianceRequests);
    }
}
