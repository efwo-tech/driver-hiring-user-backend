package com.efwo.driver_hiring_user_backend.serviceImplementation;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efwo.driver_hiring_user_backend.model.Cab;
import com.efwo.driver_hiring_user_backend.repository.CabRepository;
import com.efwo.driver_hiring_user_backend.service.CabService;

@Service
public class CabServiceImpl implements CabService {
    @Autowired
    private CabRepository repo;

    public void validateCustomerNumber(String customerNumber) {
        if (!customerNumber.matches("^\\+91\\s?\\d{10}$")) {
            throw new IllegalArgumentException("Invalid mobile number. Must start with +91 and have exactly 10 digits.");
        }
    }    

    @Override
    public Cab confirmCab(Cab cab) {
        validateCustomerNumber(cab.getCustomerNumber());

        if (cab.getSource() == null || cab.getDestination() == null) {
            throw new IllegalArgumentException("Source and destination cannot be null.");
        }

        if (cab.getBookingTime() != null && cab.getBookingTime().isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Booking time must be in the future.");
        }
        
        return repo.save(cab);
    }
}
