package org.example.Card;

import org.example.Player;

import static org.example.Type.WEAPON;

public class WeaponCard extends Card{

    public WeaponCard(int value){
        super(WEAPON, value);
    }

    @Override
    public void performAction(Player p){
        p.setWeaponCard(this);
        System.out.println("Weapon equipped");
    }
}
