package no.applitude.multiplechoice;

/**
 * Created by roypur on 1/27/16.
 */
public abstract class Creature {
    private double currentHealth = 100;
    private double maxHealth = 100;

    private String name;

    public void setStats(double health, String name){

    }


    public abstract void attacked(Attack a);
    public abstract void attack(Creature c);

    public boolean isDead(){
        return health <= 0;
    }
    public String toString(){
        return name;
    }

}
