package no.applitude.multiplechoice;

import java.util.Random;

/**
 * Created by Asbjørn on 18.02.2016.
 */
public class Quest {

    private String description;
    private Creature[] monsterPool;
    private Creature[] monsterLineup;
    //Level range
    private int lowestLevel;
    private int highestLevel;
    private int encounters;

    public Quest(){
        initMonsterLineup();
    }

    //Not done
    public void initMonsterLineup(){
        Random rand = new Random();
        monsterLineup = new Creature[encounters];
        for(int i = 0; i < encounters; i++){

        }
    }
}
