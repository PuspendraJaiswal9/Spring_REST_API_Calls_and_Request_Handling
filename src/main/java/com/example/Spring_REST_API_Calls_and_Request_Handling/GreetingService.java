package com.example.Spring_REST_API_Calls_and_Request_Handling;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreetingMessage() {
        return "Hello World";
    }
}
