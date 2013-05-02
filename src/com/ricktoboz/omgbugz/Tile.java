package com.ricktoboz.omgbugz;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 5/1/13
 * Time: 7:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Tile {
    char letter;
    int value;

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public static void printTile(Tile t) {
        System.out.println("The letter is: " + t.letter + ", and it is worth: " + t.value + " points.");
    }

    public static void testTile() {
        Tile test = new Tile('Z', 10);
        printTile(test);
    }

    public static void main(String[] args) {
        testTile();
    }
}
