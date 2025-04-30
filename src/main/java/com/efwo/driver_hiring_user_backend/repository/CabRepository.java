package com.efwo.driver_hiring_user_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efwo.driver_hiring_user_backend.model.Cab;

public interface CabRepository extends JpaRepository<Cab, Long> {
    
}
