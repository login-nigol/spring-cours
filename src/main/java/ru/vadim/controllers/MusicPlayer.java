package ru.vadim.controllers;

import ru.vadim.services.Music;

public class MusicPlayer {
    private Music music;

    // IoC инверсия управления
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic() {
        System.out.printf("Playing: " + music.getSong());
    }
}
