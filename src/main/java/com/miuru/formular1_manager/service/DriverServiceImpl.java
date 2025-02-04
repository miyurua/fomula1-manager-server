package com.miuru.formular1_manager.service;

import com.miuru.formular1_manager.entity.Driver;
import com.miuru.formular1_manager.model.DriverDTO;
import com.miuru.formular1_manager.repository.DriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {

    private final DriverRepository driverRepository;

    @Override
    public List<DriverDTO> getAllDrivers() {
        return driverRepository.findAll()
                .stream()
                .map(driver -> new DriverDTO(
                        driver.getDriverId(),
                        driver.getForename(),
                        driver.getSurname(),
                        driver.getDriverRef(),
                        driver.getDob(),
                        driver.getNationality(),
                        driver.getCode(),
                        driver.getNumber(),
                        driver.getUrl()
                ))
                .toList();
    }

    @Override
    public void saveDriverEntry(DriverDTO driverDTO) {
        driverRepository.save(
                Driver.builder()
                        .number(driverDTO.getNumber())
                        .code(driverDTO.getCode())
                        .dob(driverDTO.getDob())
                        .url(driverDTO.getUrl())
                        .forename(driverDTO.getForename())
                        .surname(driverDTO.getSurname())
                        .nationality(driverDTO.getNationality())
                        .driverRef(driverDTO.getDriverRef())
                        .build()
        );
    }

    @Override
    public void updateDriverEntry(Long id, DriverDTO driverDTO) {
        Driver existingDriver = driverRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Driver not found"));
        driverRepository.save(
        Driver.builder()
                .driverId(existingDriver.getDriverId())
                .number(driverDTO.getNumber())
                .code(driverDTO.getCode())
                .dob(driverDTO.getDob())
                .url(driverDTO.getUrl())
                .forename(driverDTO.getForename())
                .surname(driverDTO.getSurname())
                .nationality(driverDTO.getNationality())
                .driverRef(driverDTO.getDriverRef())
                .build()
        );
    }

    @Override
    public void deleteDriver(Long id){
        driverRepository.deleteById(id);
    }
}
