package no.applitude.multiplechoice;

/**
 * Created by roypur on 1/27/16.
 */
public class Stats {
    private BaseStats base;
    private int level;
    private int health;
    private int attack;
    private int defence;

    //This is a total ripoff of Pokemon's leveling system
    public void setLevel(int level){
        this.level = level;
        health = ((base.getBaseHealth()*level*2)/100)+level+10;
        attack = ((base.getBaseAttack()*level*2)/100)+5;
        defence = ((base.getBaseDefence()*level*2)/100)+5;
    }

    public BaseStats getBase() { return base; }

    public int getLevel() { return level; }

    public int getHealth() { return health; }

    public int getAttack() { return attack; }

    public int getDefence() { return defence; }
}
