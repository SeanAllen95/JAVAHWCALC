package org.example;

public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int subtractDrink(){
        return (int) (this.volume - 10);
    }

    public int emptyDrink(){
        return (int) (this.volume = 0);
    }

    public int fillDrink(){
        return (int) (this.volume = 100);
    }
}
