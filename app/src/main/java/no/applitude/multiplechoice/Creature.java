package no.applitude.multiplechoice;

/**
 * Created by roypur on 1/27/16.
 */
public abstract class Creature {
    private int health;
    private Stats stats;
    private String name;

    public Creature(String name, BaseStats base, int level){
        this.name = name;
        this.stats = new Stats(base);
        setLevel(level);
        health = stats.getHealth();
    }

    public int getHealth(){
        return health;
    }

    public void levelUp(){
        setLevel(getLevel() + 1);
    }

    public int getLevel(){
        return stats.getLevel();
    }

    public void setLevel(int level){
        stats.setLevel(level);
        health = stats.getHealth();
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
