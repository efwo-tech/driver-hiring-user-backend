package com.efwo.driver_hiring_user_backend.service;

import com.efwo.driver_hiring_user_backend.exception.ResourceNotFoundException;
import com.efwo.driver_hiring_user_backend.model.DriverDetails;
import com.efwo.driver_hiring_user_backend.repository.DriverDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverDetailsServiceImpl implements DriverDetailsService {

    private final DriverDetailsRepo driverDetailsRepo;

    @Autowired
    public DriverDetailsServiceImpl(DriverDetailsRepo driverDetailsRepo) {
        this.driverDetailsRepo = driverDetailsRepo;
    }

    @Override
    public DriverDetails getDriverDetailsById(Long id) {
        return driverDetailsRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Driver with ID " + id + " not found"));
    }
}