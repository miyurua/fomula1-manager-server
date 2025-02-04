package com.miuru.formular1_manager.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverId;

    private String code;
    private Integer number;
    private String url;
}
