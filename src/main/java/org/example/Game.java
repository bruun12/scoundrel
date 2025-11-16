package org.example;

import org.example.Card.*;

import java.io.IOException;
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
        }
        for (int i = 2; i < 10; i++) {
            Card h = new HealthCard(i);
            deck.push(h);

            Card w = new WeaponCard(i);
            deck.push(w);
        }

        return deck;
    }


    //Midgame Functions
    public void game(){
        while(!gameOver()){
            showBoard();
            turn();
        }
    }

    public boolean gameOver(){
        if(deck.isEmpty()){
            System.out.println("Congratulations! You've won!");
            System.out.println("Player health: " + player.getHealthPoints());
            return true;
        } else if (player.getHealthPoints() < 0) {
            System.out.println("Congratulations! You've lost!");
            System.out.println("Card left: " + deck.size());
            return true;
        }
        return false;
    }


    public void showBoard(){
        if (board.size() <= 1){
            System.out.println("||-------- New Room --------||");
            board.prepareBoard();
            showBoard();
        } else {
            for (int i = 0; i < board.size(); i++) {
                System.out.print(i + ":" + board.get(i).presentCard());
            }
        }
        System.out.println();
    }

    public void clearConsole() {
        System.out.print("\n\n\n\n\n");
    }

    public void turn(){

        player.showStats();

        Decision d = new Decision();

        d.makeDecision(board);

        doAction(d.getDecision());

        clearConsole();
    }

    public void doAction(int decision){
        if (decision == board.size()){
            board.wipeBoard();
        } else {
            player.actionEffect(board.get(decision));
            board.remove(decision);
        }
    }

}
