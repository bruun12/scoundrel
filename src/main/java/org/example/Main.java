package org.example;

import org.example.Card.Card;
import org.example.Card.MonsterCard;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.initGame();

        game.game();

    }
}