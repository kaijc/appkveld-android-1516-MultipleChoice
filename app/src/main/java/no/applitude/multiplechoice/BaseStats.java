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

    public void levelUp(Stats stats){
        //algorithm(random)
        stats.attack += baseAttack * 0.1;
        stats.defence += baseDefence * 0.1;
        stats.health += baseHealth * 0.5;
    }
}
