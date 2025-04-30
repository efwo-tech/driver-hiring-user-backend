package com.efwo.driver_hiring_user_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efwo.driver_hiring_user_backend.model.Cab;
import com.efwo.driver_hiring_user_backend.service.CabService;

@RestController
@RequestMapping("/cab")
public class CabController {
    @Autowired
    private CabService cabService;

    // Book a cab
    @PostMapping("/cab-confirmation")
    public ResponseEntity<Cab> confirmCab(@RequestBody Cab cab) {
        Cab confirm = cabService.confirmCab(cab);
        return ResponseEntity.ok(confirm);
    }
    
}
