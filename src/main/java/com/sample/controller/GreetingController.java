package com.sample.controller;

import com.sample.services.GreetingService;

public class GreetingController {
    private GreetingService greetingService;

    // Constructor-based Dependency Injection
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void processGreeting(String message) {
        greetingService.sendGreeting(message);
    }
}
