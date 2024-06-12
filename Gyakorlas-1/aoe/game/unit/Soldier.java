package aoe.game.unit;

import aoe.game.unit.util.Fighter;

public class Soldier implements Fighter{
    public int age;
    private static final int BASE_POWER = 10;
    public static final int COST = 400;
    public Soldier(int age){
        this.age = age;
    }
    public int getPower(){
        return age;
    }
}