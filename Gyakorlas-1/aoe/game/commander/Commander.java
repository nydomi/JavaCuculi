package aoe.game.commander;

import aoe.game.nationality.Nationality;
import aoe.game.unit.Villager;
import aoe.game.unit.util.Army;
import java.util.ArrayList;

public class Commander{
    private final string name;
    public string getName(){
        return name;
    }
    private finale Nationality nationality;
    public Nationality getNationality(){
        return nationality;
    }   
    private final int turnsToAttack;
    public int getTurnsToAttack(){
        return turnsToAttack;
    }
    private int gold;
    private int battlesWon = 0;
    public int getBattlesWon(){
        return battlesWon;
    }
    private ArrayList<Villager>villagers;
    private Army army;
    public getArmy(){
        return army;
    }
    public Commander(string name, Nationality nationality, int turnsToAttack, int gold){
        if(name == null || nationality == null || turnsToAttack < 0 || gold < 0){
            throw new IllegalArgumentException();
        }
        army = null;
        villagers = new ArrayList<Villager>();
        this.name = name;
        this.gold = gold;
        this.nationality = nationality;
        this.turnsToAttack = turnsToAttack;
    }
    public void winsBattle(){
        battlesWon++;
    }
    public void buyVillagers(){
        while(gold > Villager.COST;){
            villagers.add(new Villager(1));
            gold -= Villager.COST;
        }
    }
    public void buySoldiers(){
        while(gold > Soldier.COST;){
            villagers.add(new Villager(1));
            gold -= Villager.COST;
        }
    }
    public int gatherResources(){

    }
    public Commander attack(Commander enemy){

    }
    public void ageUnits(){

    }


}