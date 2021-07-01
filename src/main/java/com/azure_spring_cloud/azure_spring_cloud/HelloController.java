package com.azure_spring_cloud.azure_spring_cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index(){ return "Grettings from Azure Spring Cloud with Avanade"; }
}
