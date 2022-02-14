package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackController {

    @GetMapping("/userservicefallback")
    public String userServiceFallback()
    {
        return "User service is not available at this moment!!";
    }

    @GetMapping("/contactservicefallback")
    public String contactServiceFallback()
    {
        return "Contact service is not available at this moment!!";
    }


    @GetMapping("/epaycbsservicefallback")
    public String epaycbsservicefallback()
    {
        return "epaycbs service is not available at this moment!!";
    }

    @GetMapping("/epayabsservicefallback")
    public String epayabsservicefallback()
    {
        return "epayabs service is not available at this moment!!";
    }

}
