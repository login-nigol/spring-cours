package ru.vadim.models;

import ru.vadim.services.Music;

public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Играет рок музыка";
    }
}
