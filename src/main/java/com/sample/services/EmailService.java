package com.sample.services;

public class EmailService  implements GreetingService {
    @Override
    public void sendGreeting(java.lang.String message) {
        System.out.println("Email Send.");
    }
}
