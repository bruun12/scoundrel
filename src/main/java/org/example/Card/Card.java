package org.example.Card;


import org.example.Type;

abstract public class Card {
    Type type;
    int value;

    public Card(Type type, int value){
        this.type = type;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }

    public String presentCard(){
        return "Value: " + getValue() + " Type: " + getType();
    }

}
