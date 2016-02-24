package no.applitude.multiplechoice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roypur on 1/27/16.
 */
public abstract class Creature {
    private int health;
    private Stats stats;
    private String name;
    private int money;
    private List<Attack> attacks = new ArrayList<>();
    //Unicode symbol of the creature
    private char symbol;

    public Creature(String name, char symbol, BaseStats base, int level){
        this.name = name;
        this.symbol = symbol;
        this.stats = new Stats(base);
        setLevel(level);
        health = stats.getHealth();
    }

    public int getHealth(){
        return health;
    }

    public void levelUp(){
        setLevel(getStats().getLevel() + 1);
    }

    public Stats getStats() {
        return stats;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public void setLevel(int level){
        stats.setLevel(level);
        health = stats.getHealth();
    }
    //Invoked by attacking creature. c, is the
    //attacking creature
    public void attacked(Creature attacker, Attack attack) {
        double attackBoost = (double) attack.getAttackBoost();
        double attackBoostMod = (attackBoost >= 0) ?
                                (2.0 + attackBoost)/2.0 :
                                2.0/(2.0 - attackBoost);

        double modifier =   (0.1 * attack.getAttackLevel() + 1.0) *
                            (attackBoostMod);

        //This is taken directly from bulbapedia
        int damage = (int) (((2.0 * attacker.getStats().getLevel() + 10.0)/250.0) *
                            (1.0*attacker.getStats().getAttack()/1.0*this.getStats().getDefence()) *
                            (1.0*attacker.getStats().getBase().getBaseAttack()) *
                            modifier);

        health = (health - damage >= 0) ? health - damage : 0;
    }
    //Use to attack creature
    public void attack(Creature defendant, Attack attack) {
        defendant.attacked(defendant, attack);
    }

    public boolean isDead(){
        return health <= 0;
    }
    public String toString(){
        return name;
    }

}
