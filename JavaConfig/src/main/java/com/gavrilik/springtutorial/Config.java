package com.gavrilik.springtutorial;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
@ComponentScan("com.gavrilik.springtutorial")
public class Config {

/*

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }


    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic(), classicalMusic());
    }
*/


}
