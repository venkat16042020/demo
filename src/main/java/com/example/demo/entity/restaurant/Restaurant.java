package com.example.demo.entity.restaurant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.HashMap;

@EnableJpaRepositories
@ComponentScan
@EntityScan
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Restaurant {
    @Id
    @Column(nullable = false, unique = true)
    private String restaurantId;
    private String restaurantName, joinedWithOrg, ownedBy;
    private String managerName, billingCode, billingPercentage, restaurantStatus;
    private String buildingNum, street, city, state;
    private String country;
    private Integer dayCollection, weekCollection, monthCollection, yearCollection;
    private Double discountPercentage;

}
