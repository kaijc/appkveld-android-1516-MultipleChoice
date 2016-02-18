package no.applitude.multiplechoice;

/**
 * Created by Asbjørn on 18.02.2016.
 */
public class Battle {

    Creature player;
    Creature monster;

    Battle(Creature player, Creature monster) {
        this.player = player;
        this.monster = monster;
    }

    public Attack chooseAttack(int i){
        return player.getAttacks().get(i);
    }

    public boolean run(){
        return Math.random() < 0.8;
    }
}
