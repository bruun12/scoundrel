package org.example;

import org.example.Card.*;

import java.util.Collections;
import java.util.Random;
import java.util.Stack;

import static org.example.Type.*;

public class Game {

    public Stack<Card> initGame(){
        Stack<Card> deck = createCards();

        Collections.shuffle(deck, new Random());

        return deck;
    }

    public Stack<Card> createCards(){

        Stack<Card> deck = new Stack<>();

        for (int i = 2; i < 15; i++) {
            Card m = new MonsterCard(i);
            Card h = new HealthCard(i);
            Card w = new WeaponCard(i);
            deck.push(m);
            deck.push(m);
            deck.push(h);
            deck.push(w);
        }

        return deck;
    }

//    public Stack<Card> shuffle(Stack<Card> deck){
//
//
//        return deck
//    }


}
