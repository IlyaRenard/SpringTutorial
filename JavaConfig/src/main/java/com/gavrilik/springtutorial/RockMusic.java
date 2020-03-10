package com.gavrilik.springtutorial;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Genre {
    @Override
    public String getName() {
        return "ACDC - TNT";
    }
}
