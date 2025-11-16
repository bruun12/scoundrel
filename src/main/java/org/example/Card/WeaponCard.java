package org.example.Card;

import org.example.Player;

import static org.example.Type.WEAPON;

public class WeaponCard extends Card{
    private int slayValue;

    public WeaponCard(int value){
        super(WEAPON, value);
        slayValue = 14;
    }

    public int getSlayValue() {
        return slayValue;
    }

    public void setSlayValue(int slayValue) {
        this.slayValue = slayValue;
    }

    @Override
    public void performAction(Player p){
        p.setWeaponCard(this);
        System.out.println("Weapon equipped");
    }
}
