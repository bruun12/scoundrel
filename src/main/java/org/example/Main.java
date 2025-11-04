package org.example;

import org.example.Card.Card;
import org.example.Card.MonsterCard;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Stack<Card> deck =  game.initGame();

        
    }
}