package com.example.demo.entity.restaurant;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableJpaRepositories
@ComponentScan
@EntityScan
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order9 {
    @Id
    private String orderId;
    private String itemId;
//    @Column(length=10, nullable=false, unique=false)
    private String itemName;
    private int numberOfItems;
    private Boolean isTakeAway;
    private double discount;
    private String couponId;
    private double cost;


    @Value("${props.centralGst:0.00}")
    private double centralGst;
    @Value("${props.stateGst:0.00}")
    private  double stateGst;
    private double totalGst;
    private double totalCost;

}
