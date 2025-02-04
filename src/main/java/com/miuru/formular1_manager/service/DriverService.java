package com.miuru.formular1_manager.service;

import com.miuru.formular1_manager.model.DriverDTO;

import java.util.List;

public interface DriverService {
    List<DriverDTO> getAllDrivers();
    void saveDriverEntry(DriverDTO driverDTO);
    void updateDriverEntry(Long id, DriverDTO driverDTO);
    void deleteDriver(Long id);
}
