package ru.vadim.models;

import ru.vadim.services.Music;

public class ClassicalMusic implements Music {

    public void doMyInit(){
        System.out.println("Создаю инициализацию бина");
    }

    public void doMyDestroy(){
        System.out.println("Создаю уничтожение бина");
    }

    @Override
    public String getSong(){
        return "Играет классическая музыка";
    }
}
