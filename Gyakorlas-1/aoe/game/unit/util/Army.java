package aoe.game.unit.util;

import aoe.game.unit.Soldier;
import java.util.ArrayList;

public class Army extends ArrayList<Soldier>{
    public Army(){
        super();
    }
    public Army(Army army){
        super(army);
    }
    public int getPower(){
        int power = 0;
        for(int i = 0; i < this.size();i++){
            power += this.get(i).getPower();
        }
        return power;
    }
    public void decreasePowerBy(int amount){
        int i = 0;
        while(i!=amount){
            this.remove(i);
            i++;
        }
    }
    public Soldier getOldestSoldier(){
        Soldier oldest = this.get(0);
        int ind = 0;
        int age = this.get(0).age;
        for(int i = 0; i < this.size(); i++){
            if(this.get(i).age > age){
                age = this.get(i).age;
                ind = i;
                oldest = this.get(i);
            }
        }
        return oldest;
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }
    public int hashCode(){
        return super.hashCode();
    }
}