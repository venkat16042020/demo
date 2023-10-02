package com.example.demo.entity.OngolePublicSchool;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.awt.geom.Arc2D;
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
public class Admin {
    @Id
    @Column(nullable = false, unique = true)
    private String adminId;
    private String studentsId, staffsId, nonStaffsId;
    private String games, vehicles, infrastructure, media;
    private String attendance, salaries;

}
