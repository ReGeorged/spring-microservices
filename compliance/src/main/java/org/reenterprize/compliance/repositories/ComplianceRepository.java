package org.reenterprize.compliance.repositories;

import org.reenterprize.compliance.models.Compliance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplianceRepository extends
        MongoRepository<Compliance,Integer> {
}
