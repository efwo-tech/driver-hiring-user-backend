package com.efwo.driver_hiring_user_backend.service;

import com.efwo.driver_hiring_user_backend.model.DriverDetails;

public interface DriverDetailsService {
    DriverDetails getDriverDetailsById(Long id);
}