package org.example.Card;


import org.example.Player;

import static org.example.Type.MONSTER;

public class MonsterCard extends Card{

    public MonsterCard(int value){
        super(MONSTER, value);
    }

    @Override
    public void performAction(Player p){
        //If no weapon is equipped
        //You cannot use your weapon
        //Therefore you take the damage
        if(p.getWeaponCard() == null){
            p.damaged(this.getValue());
            return;
        }

        //If the slay value is smaller than the monster value.
        //You cannot use your weapon
        //Therefore you take the damage
        if (p.getWeaponCard().getSlayValue() < this.getValue()){
            p.damaged(this.getValue());
        } else {
            if (p.getWeaponCard().getValue() < this.getValue()){
                p.damaged(this.getValue() - p.getWeaponCard().getValue());
            }
            p.getWeaponCard().setSlayValue(this.getValue());
        }
        System.out.println("Monster attacked");

    }
}
