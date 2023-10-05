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
public class Classes {
    @Id
    @Column(nullable = false, unique = true)
    private String classesId;
    private String uKg, lKg, firstClass, secondClass, thirdClass, fourthClass, fifthClass;
    private String sixthClass, seventhClass, eightClass, ninthClass, tenthClass;

}
