package com.efwo.driver_hiring_user_backend.repository;

import com.efwo.driver_hiring_user_backend.model.DriverDetails;
import java.util.Optional;

public interface DriverDetailsRepo {
    Optional<DriverDetails> findById(Long id);
}