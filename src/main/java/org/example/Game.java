package org.example;

import org.example.Card.*;

import java.util.*;

public class Game {

    static List<Card> board = new ArrayList<>();
    static Stack<Card> deck = new Stack<>();

    // Game Preparing Functions

    public Stack<Card> initGame(){
        Stack<Card> deck = createCards();

        Collections.shuffle(deck, new Random());

        return deck;
    }

    public Stack<Card> createCards(){

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


    //Midgame Functions

    public void prepareBoard(){
        while (board.size() < 4){
            board.add(deck.pop());
        }
        showBoard();
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
    }







}
