package com.ricktoboz.omgbugz;

import com.ricktoboz.omgbugz.Card;
import com.ricktoboz.omgbugz.Deck;
import com.ricktoboz.omgbugz.ChapterTwelve;

import java.lang.Comparable;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 6/1/13
 * Time: 12:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChapterFourteen {

    public static void main(String[] args) {
        Deck d = new Deck();
        Deck.shuffleDeck(d);
        Arrays.sort(d.cards);
        Deck e = new Deck();
        //e = Deck.recMergeSort(d);

        System.out.println("Done!");
    }

    public static void swapCards(Deck d, int a, int b) {
        Card buffer = d.cards[a];
        d.cards[a] = d.cards[b];
        d.cards[b] = buffer;
    }

    public static void shuffleDeck(Deck d) {
        for (int i = 0; i < d.cards.length; i++) {
            swapCards(d, i, ChapterTwelve.randomInt(i, (d.cards.length - 1)));
        }
    }

}
