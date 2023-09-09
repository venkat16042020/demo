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
public class HouseHoldThings {
    @Id
    @Column(nullable = false, unique = true)
    private String HouseHoldThingsId;
    private String toolsAndSupplies, kitchenEquipment, cleaningSupplies, furniture, decor, storage;
    private Date manufactureDate, expireDate, warranty;
    private String place, price;

}
