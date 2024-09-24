package ru.vadim;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.vadim.models.ClassicalMusic;
import ru.vadim.models.RapMusic;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

        RapMusic rapMusic = context.getBean("musicBean2", RapMusic.class);

        System.out.println(rapMusic.getSong());

        context.close();
    }
}
