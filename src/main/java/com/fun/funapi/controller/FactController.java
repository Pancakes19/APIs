package com.fun.funapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class FactController {

    // 1️⃣ List of facts (stored in memory)
    private final List<String> facts = List.of(
            "Java was originally called Oak ☕",
            "Spring Boot saves lives 😭",
            "APIs let apps talk to each other",
            "IntelliJ causes emotional damage",
            "404 means the endpoint does not exist"
    );

    // 2️⃣ Random number generator
    private final Random random = new Random();

    // 3️⃣ Existing endpoint (all facts)
    @GetMapping("/api/facts")
    public List<String> getFacts() {
        return facts;
    }

    // 4️⃣ NEW: Random fact endpoint
    @GetMapping("/api/facts/random")
    public String getRandomFact() {
        int index = random.nextInt(facts.size());
        return facts.get(index);
    }
}



