package com.gavrilik.springtutorial;


import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Genre {
    @Override
    public String getName() {
        return "Hungarian Rhapsody";
    }
}
