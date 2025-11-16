package org.example;

import org.example.Card.Card;

import java.util.ArrayList;
import java.util.List;

import static org.example.Game.deck;

public class Board {
    static List<Card> board = new ArrayList<>();

    public boolean isEmpty() {
        return board.isEmpty();
    }

    public int size() {
        return board.size();
    }

    public Card get(int i) {
        return board.get(i);
    }

    public Card getFirst() {
        return board.getFirst();
    }

    public void removeFirst() {
        board.removeFirst();
    }

    public void prepareBoard(){
        while (board.size() < 4){
            board.add(deck.pop());
        }
    }

    public void wipeBoard(){
        while (!board.isEmpty()){
            deck.addFirst(board.getFirst());
            board.removeFirst();
        }
        prepareBoard();
    }
}
