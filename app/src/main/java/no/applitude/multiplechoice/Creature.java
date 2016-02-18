package no.applitude.multiplechoice;

/**
 * Created by roypur on 1/27/16.
 */
public abstract class Creature {
    private int health = 100;
    private Stats stats;
    private String name;

    public void setStats(int health, String name){

    }

    public void setLevel(int level){
        stats.setLevel(level);
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
