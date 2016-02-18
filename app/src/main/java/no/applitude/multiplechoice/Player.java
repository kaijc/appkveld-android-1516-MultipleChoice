package no.applitude.multiplechoice;

/**
 * Created by roypur on 1/20/16.
 */
public class Player {
    private String name;

    private String role;

    private int health;
    private int strength;
    private int stamina;
    private int defence;

    public Player(String name, String role){
        this.name = name;
        this.role = role;
        health = 10;
        strength = 4;
        stamina = 3;
        defence = 1;
    }
    public void damage(int amount){
        if(defence>=amount){
            health-=1;
        }else{
            health = (health - amount) + defence;
        }
    }
    public int getStrength(){
        return strength;
    }
    public int getStamina(){
        return stamina;
    }
    public boolean isDead(){
        if(health<=0){
            return true;
        }
        return false;
    }
}
