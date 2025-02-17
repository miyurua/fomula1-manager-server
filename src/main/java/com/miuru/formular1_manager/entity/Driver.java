package com.miuru.formular1_manager.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "drivers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driver_id")
    private Long driverId;
    private String forename;
    private String surname;
    @Column(name = "driver_ref")
    private String driverRef;
    private Date dob;
    private String nationality;
    private String code;
    private Integer number;
    private String url;
}
