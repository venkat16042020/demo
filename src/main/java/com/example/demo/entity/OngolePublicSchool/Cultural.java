package com.example.demo.entity.OngolePublicSchool;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class Cultural {
    @Id
    @Column(nullable = false, unique = true)
    private String culturalId;

    private String ventriloquy, mime, liveArt, standUpComedy, classicalInstrumentalMusic, aCapella;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;



}
