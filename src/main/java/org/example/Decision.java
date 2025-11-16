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

    public void makeDecision(){
        Scanner scanner = new Scanner(System.in);



        do {
            System.out.println("Press the number to the card you want to play. To wipe the board press 4");
            setDecision(scanner.nextInt());
            checkDecision();
        }while(isInvalid);

    }

    public void checkDecision(){
        if (decision < 5){
            isInvalid = false;
        } else {
            System.out.println("Invalid input ");
        }
    }

}
