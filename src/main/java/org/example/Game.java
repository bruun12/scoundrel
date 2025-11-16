package org.example;

import org.example.Card.*;

import java.util.*;

public class Game {

    static Board board = new Board();
    static Stack<Card> deck = new Stack<>();
    static Player player = new Player();
    // Game Preparing Functions


    public void initGame(){
        Stack<Card> deck = createCards();

        Collections.shuffle(deck, new Random());

        board.prepareBoard();
    }

    public Stack<Card> createCards(){
        for (int i = 2; i < 15; i++) {
            Card m = new MonsterCard(i);
            deck.push(m);
            deck.push(m);

            Card h = new HealthCard(i);
            deck.push(h);

            Card w = new WeaponCard(i);
            deck.push(w);
        }

        return deck;
    }


    //Midgame Functions
    public void game(){
        while(true){
            turn();
        }
    }


    public void showBoard(){
        if (board.isEmpty()){
            System.out.println("Board is empty");
        } else {
            for (int i = 0; i < board.size(); i++) {
                System.out.print(i + ":" + board.get(i).presentCard());
            }
        }
        System.out.println();
    }


    public void turn(){
        showBoard();

        System.out.println(player.getHealthPoints());

        Decision d = new Decision();

        d.makeDecision();

        doAction(d.getDecision());
    }

    public void doAction(int decision){
        if (decision == 4){
            board.wipeBoard();
        } else {
            player.actionEffect(board.get(decision));
        }
    }

}
