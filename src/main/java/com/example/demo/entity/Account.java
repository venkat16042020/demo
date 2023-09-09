package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
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
public class Account {
    @Id
    @Column(nullable = false, unique = true)
    private String accountId;
    private String accountName, createdOn, createdBy, createdBranch, branchAdd, branchManagerId;
    private int amount,  blockedAmount, finalAmount;
    private String  accountPlan, accountSubPlan, accCurrentManager, accountStatus;

}
