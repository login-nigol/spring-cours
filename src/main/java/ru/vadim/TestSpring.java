package ru.vadim;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vadim.controllers.MusicPlayer;
import ru.vadim.services.Music;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        context.close();
    }
}
