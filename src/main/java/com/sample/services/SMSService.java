package com.sample.services;

public class SMSService implements GreetingService {

    @Override
    public void sendGreeting(String message) {
        System.out.println("SMS send");
    }
}
