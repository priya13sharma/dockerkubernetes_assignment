package com.api.SpringBootApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MyController {
    @GetMapping("/home")
    public Map<String, Object> getValues() {
       Map<String, Object> data = new HashMap<>();
       data.put("name", "My name is Priya Sharma.");
       data.put("languages", Arrays.asList("Hindi","Punjabi","English"));
        data.put("myFavBooks", Arrays.asList("The Guide","The Room on the Roof","The white tiger","A suitable Boy","India war"));

        data.put("designation","Software Engineer");
        data.put("message","Ok Bye, Tata");
        return data;
    }
}
