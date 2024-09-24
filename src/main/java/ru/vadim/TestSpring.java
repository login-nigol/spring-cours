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

        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstmusicPlayer.playMusicList();

        boolean comparison = firstmusicPlayer == secondmusicPlayer;

        System.out.println(comparison);

        System.out.println(firstmusicPlayer);
        System.out.println(secondmusicPlayer);

        firstmusicPlayer.setVolume(10);

        System.out.println(firstmusicPlayer.getVolume());
        System.out.println(secondmusicPlayer.getVolume());

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
