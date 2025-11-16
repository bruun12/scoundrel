package org.example.Card;

import org.example.Player;

import static org.example.Type.HEALTH;

public class HealthCard extends Card{

    public HealthCard(int value){
        super(HEALTH, value);
    }

    @Override
    public void performAction(Player p){
        p.healed(this.getValue());
        System.out.println("Player healed");
    }
}
