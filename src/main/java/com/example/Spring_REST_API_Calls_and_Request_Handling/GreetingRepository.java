package com.example.Spring_REST_API_Calls_and_Request_Handling;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
    Optional<Greeting> findById(Long id);
}

