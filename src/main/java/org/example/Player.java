package org.example;

import org.example.Card.WeaponCard;

public class Player {
    int healthPoints;
    WeaponCard weaponCard;

    public Player(){
        healthPoints = 20;
    }

    public void damaged(int damage){
        healthPoints = healthPoints - damage;
    }

    public void healed(int heal){
        healthPoints = healthPoints - heal;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setWeaponCard(WeaponCard weaponCard) {
        this.weaponCard = weaponCard;
    }
}
