package org.reenterprize.compliance.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder(setterPrefix = "set")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Compliance {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;
    private Integer customerId;
    private Boolean complyStatus;
    private LocalDateTime lastCheckAt;
    private String nonComplyReason;

}
