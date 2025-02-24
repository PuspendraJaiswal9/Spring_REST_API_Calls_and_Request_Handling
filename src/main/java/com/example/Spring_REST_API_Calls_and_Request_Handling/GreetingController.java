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

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/newget")
    public String getGreetingNew() {
        return "{\"message\": \"" + greetingService.getGreetingMessage() + "\"}";
    }

    @GetMapping("/para")
    public String getGreetingPara(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        return greetingService.getGreetingMessage(firstName, lastName);
    }
    @GetMapping("/{id}")
    public String getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }
}
