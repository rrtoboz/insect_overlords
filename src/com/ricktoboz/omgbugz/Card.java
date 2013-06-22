package com.ricktoboz.omgbugz;

import java.lang.Comparable;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 5/21/13
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
class Card implements Comparable<Card> {
    int suit, rank;

    static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    static String[] ranks = {"narf", "Ace", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "Jack", "Queen", "King"};

    /*
     * No-argument constructor.
     */
    public Card() {
        this.suit = 0;
        this.rank = 0;
    }

    /*
     * Constructor with arguments.
     */
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int compareTo(Card c) {
        // first compare the suits
        if (suit > c.suit) return 1;
        if (suit < c.suit) return -1;

        // if the suits are the same,
        // use modulus arithmetic to rotate the ranks
        // so that the Ace is greater than the King.
        // WARNING: This only works with valid ranks!
        int rank1 = (rank + 11) % 13;
        int rank2 = (c.rank + 11) % 13;

        // compare the rotated ranks

        if (rank1 > rank2) return 1;
        if (rank1 < rank2) return -1;
        return 0;
    }

    /*
     * Prints a card in human-readable form.
     */
    public static void printCard(Card c) {
        System.out.println(ranks[c.rank] + " of " + suits[c.suit]);
    }

    /*
     * Return true if the cards are equivalent.
     */
    public static boolean sameCard(Card c1, Card c2) {
        return (c1.suit == c2.suit && c1.rank == c2.rank);
    }

    /*
     * Compares two cards: returns 1 if the first card is greater
     * -1 if the seconds card is greater, and 0 if they are the equivalent.
     */
    public static int compareCards(Card c1, Card c2) {

        // first compare the suits
        if (c1.suit > c2.suit) return 1;
        if (c1.suit < c2.suit) return -1;

        // if the suits are the same,
        // use modulus arithmetic to rotate the ranks
        // so that the Ace is greater than the King.
        // WARNING: This only works with valid ranks!
        int rank1 = (c1.rank + 11) % 13;
        int rank2 = (c2.rank + 11) % 13;

        // compare the rotated ranks

        if (rank1 > rank2) return 1;
        if (rank1 < rank2) return -1;
        return 0;
    }
}

