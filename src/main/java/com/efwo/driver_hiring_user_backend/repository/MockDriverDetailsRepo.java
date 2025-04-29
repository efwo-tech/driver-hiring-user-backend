package com.efwo.driver_hiring_user_backend.repository;

import com.efwo.driver_hiring_user_backend.model.DriverDetails;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Repository
public class MockDriverDetailsRepo implements DriverDetailsRepo{

    private static final Map<Long, DriverDetails> MOCK_DRIVERS = Map.of(
            1L, new DriverDetails(1L, "Driver1", "9876543210", true, 120.5),
            2L, new DriverDetails(2L, "Driver2", "9845011122", false, 100.0)
    );

    @Override
    public Optional<DriverDetails> findById(Long id) {
        return Optional.ofNullable(MOCK_DRIVERS.get(id));
    }
}