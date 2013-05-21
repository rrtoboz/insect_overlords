package com.ricktoboz.omgbugz;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 5/21/13
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class Card {

    int suit, rank;

    public Card() {
        this.suit = 0;
        this.rank = 0;
    }

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public static int compareCards(Card c1, Card c2) {
        if (c1.suit > c2.suit) {
            return 1;
        }
        if (c1.suit < c2.suit) {
            return -1;
        }
        if (c1.rank > c2.rank) {
            return 1;
        }
        if (c1.rank < c2.rank) {
            return -1;
        }
        return 0;
    }

    public static Card[] makeDeck() {
        Card[] cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(suit, rank);
                index++;
            }
        }
        return cards;
    }

    public static int handScore(Card[] cards) {
        int score = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].rank > 10) {
                score = (score + 10);
            } else {
                score = (score + cards[i].rank);
            }
        }
        return score;
    }

    public static int[] suitHist(Card[] cards) {
        int[] histogram = new int[4];
        for (int i = 0; i < cards.length; i++) {
            histogram[cards[i].suit]++;
        }
        return histogram;
    }

    public static boolean hasFlush(Card[] cards) {
        int[] a = new int[0];
        a = suitHist(cards);
        if (a[0] >= 5) {
            return true;
        }
        if (a[1] >= 5) {
            return true;
        }
        if (a[2] >= 5) {
            return true;
        }
        if (a[3] >= 5) {
            return true;
        }
        return false;
    }
}

