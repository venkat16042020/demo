package com.example.demo.entity.restaurant;

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
public class Bill {
    @Id
    @Column(nullable = false, unique = true)
    private String billId;
    private Date date;
    private String address, item;
    private Integer quantity, price, discount, amount;

}
