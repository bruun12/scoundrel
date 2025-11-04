package org.example;

import org.example.Card.*;

import java.util.*;

public class Game {

    static List<Card> board = new ArrayList<>();
    static Stack<Card> deck = new Stack<>();
    static Player player = new Player();
    // Game Preparing Functions

    public void initGame(){
        Stack<Card> deck = createCards();

        Collections.shuffle(deck, new Random());

        prepareBoard();
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

    public void prepareBoard(){
        while (board.size() < 4){
            board.add(deck.pop());
        }

        showBoard();
    }

    //Midgame Functions
    public void game(){
        while(true){

        }
    }


    public void showBoard(){
        if (board.isEmpty()){
            System.out.println("Board is empty");
        } else {
            for (Card card : board) {
                System.out.println(card.presentCard());
            }
        }
        System.out.println();
    }

    public void wipeBoard(){
        while (!board.isEmpty()){
            deck.addFirst(board.getFirst());
            board.removeFirst();
        }
        prepareBoard();
    }
}
