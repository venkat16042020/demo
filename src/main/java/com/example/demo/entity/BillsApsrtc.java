package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;

@EnableJpaRepositories
@ComponentScan
@EntityScan
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BillsApsrtc {
    @Id
    @Column(nullable = false, unique = true)
    private String billId;
    private String consumerName, consumerNo, address;
    private Date billDate, discountDate, dueDate, billPeriod, billMonth;
    private Integer meterNo, metreUnits, unitsBased, billAmount, discountAmount;

}
