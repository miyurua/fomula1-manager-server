package com.miuru.formular1_manager.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConstructorDTO {
    private Long constructorId;
    private String constructor_ref;
    private String name;
    private String nationality;
    private String url;
}
