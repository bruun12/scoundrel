package org.example.Card;


import org.example.Player;

import static org.example.Type.MONSTER;

public class MonsterCard extends Card{

    public MonsterCard(int value){
        super(MONSTER, value);
    }

    @Override
    public void performAction(Player p){
        p.damaged(this.getValue());
        System.out.println("Monster attacked");

    }
}
