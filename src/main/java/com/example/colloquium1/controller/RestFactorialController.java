package com.example.colloquium1.controller;

import com.example.colloquium1.service.FactorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestFactorialController {
    private FactorialService factorialService;

    @Autowired
    public RestFactorialController(FactorialService factorialService) {
        this.factorialService = factorialService;
    }

    @GetMapping("/factorial")
    public long factorial(@RequestParam int n) {
        return factorialService.factorial(n);
    }

    @GetMapping("/first-factorials")
    public long[] firstFactorials(@RequestParam int n) {
        return factorialService.firstFactorials(n);
    }
}
