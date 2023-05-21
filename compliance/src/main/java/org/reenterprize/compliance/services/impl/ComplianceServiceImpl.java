package org.reenterprize.compliance.services.impl;

import lombok.AllArgsConstructor;
import org.reenterprize.compliance.models.Compliance;
import org.reenterprize.compliance.repositories.ComplianceRepository;
import org.reenterprize.compliance.requests.ComplianceRequests;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@AllArgsConstructor
public class ComplianceServiceImpl {
    private final ComplianceRepository complianceRepository;

    public Boolean isCompliant(ComplianceRequests complianceRequests){
        Compliance compliance =  Compliance.builder()
                .setCustomerId(complianceRequests.getCustomerId())
                .setComplyStatus(true)
                .setLastCheckAt(LocalDateTime.now())
                .build();
        complianceRepository.save(compliance);
        return true;
    }

    public void addNotCompliant(ComplianceRequests complianceRequests){
        Compliance compliance = Compliance.builder()
                .setNonComplyReason(complianceRequests.getNonComplyReason())
                .setCustomerId(complianceRequests.getCustomerId())
                .setLastCheckAt(LocalDateTime.now())
                .build();
        complianceRepository.save(compliance);
    }
}
