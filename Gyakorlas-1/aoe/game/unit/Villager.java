package aoe.game.unit;

import aoe.game.unit.util.Worker;

public class Villager implements Worker {
    public int age;
    private static final int GATHER_AMOUNT = 10;
    public static final int COST = 100;

    public Villager(int age){
        this.age = age;
    }
    public int work(){
        return age;
    }
}
