package ru.vadim.models;

import ru.vadim.services.Music;

public class RapMusic implements Music {

    private RapMusic(){} // приватный конструктор для ограничения создания объектов с помощью NEW.

    public static RapMusic getRapMusic(){
        return new RapMusic();
    }

    public void doMyInit(){
        System.out.println("Создаю инициализацию бина");
    }

    public void doMyDestroy(){
        System.out.println("Создаю уничтожение бина");
    }

    @Override
    public String getSong() {
        return "Играет рэп музыка";
    }
}
