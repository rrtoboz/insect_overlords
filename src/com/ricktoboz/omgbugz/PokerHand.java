package com.ricktoboz.omgbugz;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 6/27/13
 * Time: 7:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class PokerHand extends Deck {

    public PokerHand(int n) {
        this.cards = new Card[n];
    }

    public boolean hasFlush() {
        this.recMergeSort();
        for (int i = 0; i < (cards.length - 1); i++) {
            if (cards[i].suit != cards[i + 1].suit) {
                return false;
            }
        }
        return true;
    }

    public boolean hasThreeKind() {
        int[] n = new int[14];
        for (int i = 0; i < cards.length; i++) {
            n[this.cards[i].rank]++;
            if (n[this.cards[i].rank] >= 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
