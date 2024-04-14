package com.example.demo.entity.fromEmployee;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class OrderNew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long orderId;

    private Long itemId;
    private String itemName;
    private double rawCost;
    private double StateGST;
    private double centralGST;
    private double totalGST;
    private double totalCost;
    private String description;


}
