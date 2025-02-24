package com.example.Spring_REST_API_Calls_and_Request_Handling;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @GetMapping()
    public String getGreeting(){
        return "{\"message\": \"hello, this is a get request\"}";
    }

    @PostMapping("/post")
    public String postGreeting(){
        return "{\"message\": \"hello, this is a post request\"}";
    }

    @PutMapping
    public String putGreeting(){
        return "{\"message\": \"hello, this is a put request\"}";
    }

    @DeleteMapping
    public String deleteGreeting(){
        return "{\"message\": \"hello, this is a delete request\"}";
    }
}
