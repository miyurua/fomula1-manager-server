package com.miuru.formular1_manager.controller;

import com.miuru.formular1_manager.model.ConstructorDTO;
import com.miuru.formular1_manager.service.ConstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("constructors")
@RequiredArgsConstructor
public class ConstructorController {
    public final ConstructorService constructorService;

    @GetMapping
    public List<ConstructorDTO> getAllConstructors() {
        return constructorService.getAllConstructors();
    }
}
