package ru.netology.unit;

public class BonusService {

    private final int boundary = 1000;


    public int remain(int amount) {
        return boundary - amount % boundary;
    }


}
