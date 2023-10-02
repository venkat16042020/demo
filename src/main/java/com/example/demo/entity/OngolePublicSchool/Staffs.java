package com.example.demo.entity.OngolePublicSchool;

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
public class Staffs {
    @Id
    @Column(nullable = false, unique = true)
    private String staffsId;
    private String firstName, lastName, gender, address, phoneNo, emailId;
    private Integer Age;

}
