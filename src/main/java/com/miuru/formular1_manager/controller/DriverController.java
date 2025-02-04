package com.miuru.formular1_manager.controller;

import com.miuru.formular1_manager.entity.Driver;
import com.miuru.formular1_manager.repository.DriverRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    private final DriverRepository driverRepository;

    public DriverController(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @GetMapping
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    @PostMapping
    public Driver addDriver(@RequestBody Driver driver) {
        return driverRepository.save(driver);
    }
}