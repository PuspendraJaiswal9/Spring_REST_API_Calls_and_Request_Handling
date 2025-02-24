package com.example.Spring_REST_API_Calls_and_Request_Handling;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreetingMessage() {
        return "Hello World";
    }

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getGreetingMessage(String firstName, String lastName) {
        String message;
        if (firstName != null && lastName != null) {
            message = "Hello, " + firstName + " " + lastName + "!";
        } else if (firstName != null) {
            message= "Hello, " + firstName + "!";
        } else if (lastName != null) {
            message= "Hello, " + lastName + "!";
        } else {
            message= "Hello World!";
        }
        // ✅ Save to Database
        Greeting greeting = new Greeting(message);
        greetingRepository.save(greeting);
        return message;
    }
}
