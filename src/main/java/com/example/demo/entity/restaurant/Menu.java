package com.example.demo.entity.restaurant;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.format.annotation.DateTimeFormat;

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
public class Menu {
    @Id
    @Column(nullable = false, unique = true)
    private String itemId;
    private String menuId;
    private String itemName;
    private Double cost;
    private Integer numberOfItemsAvailable;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
}
