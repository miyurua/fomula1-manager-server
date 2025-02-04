package com.miuru.formular1_manager.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "CONSTRUCTORS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Constructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "constructor_id")
    private Long constructorId;
    @Column(name = "constructor_ref")
    private String constructor_ref;
    private String name;
    private String nationality;
    private String url;
}
