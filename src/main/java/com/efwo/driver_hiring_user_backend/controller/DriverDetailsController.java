package com.efwo.driver_hiring_user_backend.controller;

import com.efwo.driver_hiring_user_backend.model.DriverDetails;
import com.efwo.driver_hiring_user_backend.service.DriverDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/getDriverDetails")
public class DriverDetailsController {

    private final DriverDetailsService driverDetailsService;

    @Autowired
    public DriverDetailsController(DriverDetailsService driverDetailsService) {
        this.driverDetailsService = driverDetailsService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DriverDetails> getDriverDetails(@PathVariable Long id) {
        DriverDetails driver = driverDetailsService.getDriverDetailsById(id);
        return ResponseEntity.ok(driver);
    }
}