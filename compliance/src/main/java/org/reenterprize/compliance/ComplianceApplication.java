package org.reenterprize.compliance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class ComplianceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComplianceApplication.class,args);
    }
}
