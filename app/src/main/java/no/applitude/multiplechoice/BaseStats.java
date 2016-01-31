package no.applitude.multiplechoice;

/**
 * Created by roypur on 1/27/16.
 */
public class BaseStats {

    private final int baseHealth;
    private final int baseAttack;
    private final int baseDefence;

    public BaseStats(int health, int attack, int defence){
        baseHealth = health;
        baseAttack = attack;
        baseDefence = defence;
    }

    public int getBaseHealth() {
        return baseHealth;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getBaseDefence() { return baseDefence; }
}
