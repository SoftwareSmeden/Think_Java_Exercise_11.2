package com.company;

public class Main {

    public static void main(String[] args) {
    // Think Java - Exercise 11.2

    // Objects used for the class Tile.
    Tile tileOne = new Tile('z', 10);

    Tile tileTwo = new Tile('a',  12);

    Tile tileThree = new Tile('a',  12);

        // Invokes the method "printTile".
        printTile(tileOne);

        System.out.println(tileOne.equals(tileTwo));
        System.out.println(tileTwo.equals(tileThree));

        System.out.println(tileOne.getValue());
        System.out.println(tileOne.getLetter());

        // This modifies the instance variables for "tileOne".
        tileOne.setLetter('b');
        System.out.println(tileOne.getLetter());
        tileOne.setValue(5);
        System.out.println(tileOne.getValue());

    }
    public static void printTile(Tile tilePrint){

        System.out.println(tilePrint);

    }


}

