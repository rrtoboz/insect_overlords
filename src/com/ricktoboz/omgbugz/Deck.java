package com.ricktoboz.omgbugz;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 6/1/13
 * Time: 12:07 PM
 * To change this template use File | Settings | File Templates.
 */
/*
 * A Deck contains an array of cards.
 */
class Deck {
    Card[] cards;

    /*
     * Makes a Deck with room for n Cards (but no Cards yet).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /*
     * Makes an array of 52 cards.
     */
    public Deck() {
        this.cards = new Card[52];

        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(suit, rank);
                index++;
            }
        }
    }

    /*
     * Prints a deck of cards.
     */
    public static void printDeck(Deck deck) {
        for (int i = 0; i < deck.cards.length; i++) {
            Card.printCard(deck.cards[i]);
        }
    }

    /*
     * Returns index of the first location where card appears in deck.
     * Or -1 if it does not appear.  Uses a linear search.
     */
    public static int findCard(Deck deck, Card card) {
        for (int i = 0; i < deck.cards.length; i++) {
            if (Card.sameCard(card, deck.cards[i])) {
                return i;
            }
        }
        return -1;
    }

    /*
     * Returns index of a location where card appears in deck.
     * Or -1 if it does not appear.  Uses a bisection search.
     *
     * Searches from low to high, including both.
     *
     * Precondition: the cards must be sorted from lowest to highest.
     */
    public static int findBisect(Deck deck, Card card, int low, int high) {
        if (high < low) return -1;

        int mid = (high + low) / 2;
        int comp = Card.compareCards(card, deck.cards[mid]);

        if (comp == 0) {
            return mid;
        } else if (comp < 0) {
            // card is less than deck.cards[mid]; search the first half
            return findBisect(deck, card, low, mid - 1);
        } else {
            // card is greater; search the second half
            return findBisect(deck, card, mid + 1, high);
        }
    }

    /*
     * Chooses a random integer between low and high, including low,
     * not including high.
     */
    public static int randInt(int low, int high) {
        if (low == high) {
            return low;
        }
        if (low > high) {
            int bridge = low;
            low = high;
            high = bridge;
        }
        int x = (high - low);
        int y = (low + (int) (StrictMath.random() * x));
        return y;
    }

    /*
     * Swaps two cards in a deck of cards.
     */
    public static void swapCards(Deck d, int a, int b) {
        Card buffer = d.cards[a];
        d.cards[a] = d.cards[b];
        d.cards[b] = buffer;
    }


    /*
     * Shuffles the cards in a deck.
     */
    public static void shuffleDeck(Deck d) {
        for (int i = 0; i < d.cards.length; i++) {
            swapCards(d, i, ChapterTwelve.randomInt(i, (d.cards.length - 1)));
        }
    }

    /*
     * Sorts a deck from low to high.
     */
    public static void sortDeck(Deck deck) {
    }

    /*
     * Finds the index of the lowest card between low and high,
     * including both.
     */
    public static int indexLowestCard(Deck deck, int low, int high) {
        return 0;
    }

    /*
     * Makes a new deck of cards with a subset of cards from the original.
     * The old deck and new deck share references to the same card objects.
     */
    public static Deck subdeck(Deck deck, int low, int high) {
        Deck sub = new Deck(high - low + 1);

        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = deck.cards[low + i];
        }
        return sub;
    }

    /*
     * Merges two sorted decks into a new sorted deck.
     */
    public static Deck merge(Deck d1, Deck d2) {
        return d1;
    }

    /*
     * Sort the Deck using merge sort.
     */
    public static Deck mergeSort(Deck deck) {
        return deck;
    }
}