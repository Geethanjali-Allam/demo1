package com.example.demo.controller;
import com.example.demo.model.cloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudVendor")

public class CloudVendorAPIServices {
    @GetMapping("/{vendorId}")
    public cloudVendor getCloudVendorDetails(@PathVariable String vendorId) {

        return new cloudVendor("c2","vendor1" ,
                                "Address1","Phone number1");
    }
}


