package org.example;

import org.example.Card.Card;

import org.example.Card.WeaponCard;


public class Player {
    int healthPoints;
    WeaponCard weaponCard;

    public Player(){
        healthPoints = 20;
    }

    public void actionEffect(Card c){
        c.performAction(this);
    }

    public void showStats(){
        System.out.println("------ Player Stats ------");
        System.out.println("Health Points: " + healthPoints);
        if (weaponCard == null){
            System.out.println("Weapon Value: Weapon not equipped");
            System.out.println("Weapon Fatigue: Weapon not equipped");
        } else {
            System.out.println("Weapon Value: " + weaponCard.getValue());
            System.out.println("Weapon Fatigue: " + weaponCard.getSlayValue());
        }
        System.out.println("--------------------------");
    }

    public void damaged(int damage){
        healthPoints = healthPoints - damage;
    }

    public void healed(int heal){healthPoints = healthPoints + heal;}

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setWeaponCard(WeaponCard weaponCard) {
        this.weaponCard = weaponCard;
    }

    public WeaponCard getWeaponCard(){
        return this.weaponCard;
    }

}
