package com.example.demo.controller;
import com.example.demo.model.cloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")

public class CloudVendorAPIServices {

    cloudVendor cloudVendor;
    @GetMapping("/{vendorId}")
    public cloudVendor getCloudVendorDetails(@PathVariable String vendorId) {

        /*return new cloudVendor("c1","vendor1" ,
                                "Address1","Phone number1");*/
        return cloudVendor;
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody cloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud vendor created Successfully";
    }
    @PutMapping
    public String UpdateCloudVendorDetails(@RequestBody cloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud vendor Updated Successfully";
    }
    @DeleteMapping("{vendorId}")
    public String DeleteCloudVendorDetails(String vendorId) {
        this.cloudVendor = null;
        return "Cloud vendor Deleted Successfully";
    }
}


