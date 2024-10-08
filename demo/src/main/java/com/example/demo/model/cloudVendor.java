package com.example.demo.model;

public class cloudVendor {

    private String vendorID;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    public cloudVendor(String vendorID, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorID = vendorID;
        this.vendorName=vendorName;
        this.vendorAddress=vendorAddress;
        this.vendorPhoneNumber=vendorPhoneNumber;
    }

    public cloudVendor() {
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}
