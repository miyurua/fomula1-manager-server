package com.miuru.formular1_manager.model;

import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DriverDTO {
    private Long driverId;
    private String forename;
    private String surname;
    private String driverRef;
    private Date dob;
    private String nationality;
    private String code;
    private Integer number;
    private String url;
}
