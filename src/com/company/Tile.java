package com.company;

public class Tile {

    private char letter;
    private int value;

    // The constructor that takes two parameters.
    Tile(char let, int val) {
        letter = let;
        value = val;
    }

    // This string method is used for "override" to prevent the "sout" for displaying the address for the object.
    public String toString() {
        return "Value: " + value + " Letter: " + letter;
    }

    // This method checks whether the two objects have the same values.
    public boolean equals(Tile that){
        return this.value == that.value && this.letter == that.letter;
    }

    // This method is called an accessor, but also known as a "getter" and it returns the value of an instance variable.
    public int getValue(){
        return value;
    }

    // This method is called an accessor, but also known as a "getter" and it returns the value of an instance variable.
    public char getLetter() {
        return letter;
    }

    // This method assigns a value to the instance variable "letter".
    public void setLetter(char let) {
        this.letter = let;
    }

    // This method assigns a value to the instance variable "value".
    public void setValue(int val) {
        this.value = val;
    }
}
