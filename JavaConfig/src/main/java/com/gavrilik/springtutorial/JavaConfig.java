package com.gavrilik.springtutorial;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                Config.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(musicPlayer.playMusic());
        System.out.println(classicalMusic.getName());


    }
}
