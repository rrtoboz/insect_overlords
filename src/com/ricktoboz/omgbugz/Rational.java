package com.ricktoboz.omgbugz;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 5/1/13
 * Time: 7:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rational {
    int numerator;
    int denominator;

    public Rational() {

    }

    public Rational(int n, int d) {
        this.numerator = n;
        this.denominator = d;
    }

    public static void main(String[] arg) {
        Rational Billy = new Rational();
        Billy.numerator = 2;
        Billy.denominator = 10;
        Rational Timmy = new Rational();
        Timmy.numerator = 4;
        Timmy.denominator = 10;
        Rational Jimmy = Billy.rationalAdd(Timmy);
        System.out.println(Jimmy.numerator + "/" + Jimmy.denominator);
    }

    private void printRational() {
        System.out.println("Your Rational is: " + numerator + "/" + denominator + ".");
    }

    private void negate() {
        numerator = (numerator * -1);
    }

    private void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    private double toDouble() {
        return ((double) numerator / (double) denominator);
    }

    private void reduce() {
        if (numerator == denominator) {
            return;
        }
        if (numerator > denominator) {
        }
        if (numerator == 0 || denominator == 0) {
            return;
        }
        int one = denominator;
        int two = numerator;
        int temp = 0;
        while (two != 0) {
            temp = one;
            one = two;
            two = (temp % two);
        }
        numerator = (numerator / one);
        denominator = (denominator / one);
        return;
    }

    private Rational rationalAdd(Rational b) {
        int a1 = denominator;
        int b1 = b.denominator;
        numerator = (numerator * b1);
        denominator = (denominator * b1);
        b.numerator = (b.numerator * a1);
        b.denominator = (b.denominator * a1);
        Rational c = new Rational();
        c.numerator = (numerator + b.numerator);
        c.denominator = (denominator);
        c.reduce();
        return (c);
    }

    public static void youracusk() {
        System.out.println("Give me rusk!");
    }
}
