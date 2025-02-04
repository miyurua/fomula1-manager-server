package com.miuru.formular1_manager.repository;

import com.miuru.formular1_manager.entity.Constructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructorRepository extends JpaRepository<Constructor, Long> {
}
