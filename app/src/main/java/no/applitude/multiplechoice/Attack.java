package no.applitude.multiplechoice;

/**
 * Created by Asbjørn on 31.01.2016.
 */
public class Attack {
    //A number describing the base power of the attack
    private int basePower;
    //A modifier used in battle to boost the power of the attack.
    //I suggest we use a scheme similair to Pokemon (if we end up
    // using it at all)Where an attack can be boosted by or
    //de-boosted by 6 stages where each stage increases or decreases
    //the actual attack power by .5 of the base
    private int attackBoost = 0;
    //The level of the attack increases the Attackpower by some
    //points based on the base power of the attack.
    //Weak attacks does not benefit as much from level up as
    //stronger attacks.
    private int attackLevel;
    private String name;

    public Attack(int basePower, int attackLevel){
        this.basePower = basePower;
        this.attackLevel = attackLevel;
    }

    public int getBasePower() {
        return basePower;
    }

    public int getAttackBoost() {
        return attackBoost;
    }

    public int getAttackLevel() {
        return attackLevel;
    }
}
