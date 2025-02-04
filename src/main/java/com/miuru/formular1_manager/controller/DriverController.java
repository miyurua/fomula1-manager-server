package com.miuru.formular1_manager.controller;

import com.miuru.formular1_manager.model.DriverDTO;
import com.miuru.formular1_manager.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
@RequiredArgsConstructor
public class DriverController {

    private final DriverService driverService;

    @GetMapping
    public List<DriverDTO> getAllDrivers() {
        return driverService.getAllDrivers();
    }

    @PostMapping("add")
    public void addDriver(@RequestBody DriverDTO driverDTO) {
        driverService.saveDriverEntry(driverDTO);
    }

    @PutMapping("update/{id}")
    public void updateDriver(@PathVariable long id, @RequestBody DriverDTO driverDTO) {
        driverService.updateDriverEntry(id, driverDTO);
    }

    @DeleteMapping("delete/{id}")
    public void deleteDriver(@PathVariable long id){
        driverService.deleteDriver(id);
    }
}