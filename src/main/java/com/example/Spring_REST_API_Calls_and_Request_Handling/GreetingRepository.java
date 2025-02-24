package com.example.Spring_REST_API_Calls_and_Request_Handling;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
