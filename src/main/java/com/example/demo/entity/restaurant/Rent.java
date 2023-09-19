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
public class Rent {
    @Id
    @Column(nullable = false, unique = true)
    private String rentId;
    private String address;
    private Double amount, advanced;
    private Date year, date;
}
