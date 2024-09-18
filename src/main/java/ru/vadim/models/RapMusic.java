package ru.vadim.models;

import ru.vadim.services.Music;

public class RapMusic implements Music {

    @Override
    public String getSong() {
        return "Играет рэп музыка";
    }
}
