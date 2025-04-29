package com.efwo.driver_hiring_user_backend.model;

public class DriverDetails {
    private Long id;
    private String name;
    private String mobileNumber;
    private boolean isVerified;
    private double fareAmount;

    public DriverDetails(Long id, String name, String mobileNumber, boolean isVerified, double fareAmount) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.isVerified = isVerified;
        this.fareAmount = fareAmount;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getMobileNumber() { return mobileNumber; }
    public boolean isVerified() { return isVerified; }
    public double getFareAmount() { return fareAmount; }
}