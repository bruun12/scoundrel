package org.example;

import java.util.Scanner;

public class Decision {
    int decision;
    boolean isInvalid = true;

    public void setDecision(int decision) {
        this.decision = decision;
    }

    public int getDecision() {
        return decision;
    }

    public void makeDecision(Board board){
        Scanner scanner = new Scanner(System.in);

        do {
            if (board.size() == 4){
                System.out.println("Press the number to the card you want to play. To wipe the board press " + board.size());
            } else{
                System.out.println("Press the number to the card you want to play.");
            }
            setDecision(scanner.nextInt());
            checkDecision(board);
        }while(isInvalid);
    }

    public void checkDecision(Board board){
        if (decision >= 0 && decision < board.size()){
            isInvalid = false;
        } else if (decision == board.size() && board.size() == 4) {
            isInvalid = false;
        } else {
            System.out.println("Invalid input ");
        }
    }

}
