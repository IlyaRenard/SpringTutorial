package by.gavrilik.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfig {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "context.xml"
        );

        FirstBean firstBean = context.getBean("firstBean", FirstBean.class);
        System.out.println(firstBean.getName());

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList();

        System.out.println("Name: " + musicPlayer.getName());
        System.out.println("Volume: " + musicPlayer.getVolume());

    }

}
