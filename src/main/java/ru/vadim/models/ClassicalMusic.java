package ru.vadim.models;

import ru.vadim.services.Music;

public class ClassicalMusic implements Music {

    @Override
    public String getSong(){
        return "Играет классическая музыка";
    }
}
