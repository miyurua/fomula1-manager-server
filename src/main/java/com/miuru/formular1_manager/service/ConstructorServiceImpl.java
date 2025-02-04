package com.miuru.formular1_manager.service;

import com.miuru.formular1_manager.model.ConstructorDTO;
import com.miuru.formular1_manager.repository.ConstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConstructorServiceImpl implements ConstructorService {

    private final ConstructorRepository constructorRepository;

    @Override
    public List<ConstructorDTO> getAllConstructors() {
        return constructorRepository.findAll()
                .stream()
                .map(constructor -> new ConstructorDTO(
                        constructor.getConstructorId(),
                        constructor.getConstructor_ref(),
                        constructor.getName(),
                        constructor.getNationality(),
                        constructor.getUrl()
                )).toList();
    }
}
