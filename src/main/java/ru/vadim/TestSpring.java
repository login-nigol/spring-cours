package ru.vadim;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vadim.controllers.MusicPlayer;
import ru.vadim.services.Music;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        // ручное внедрение зависимости musicBean через конструктор
        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusicList();

        System.out.println();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
