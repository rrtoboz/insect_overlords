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
        Rational Jimmy = rationalAdd(Billy, Timmy);
        System.out.println(Jimmy.numerator + "/" + Jimmy.denominator);
    }

    private static void printRational(Rational r) {
        System.out.println("Your Rational is: " + r.numerator + "/" + r.denominator + ".");
    }

    private static void negate(Rational r) {
        r.numerator = (r.numerator * -1);
    }

    private static void invert(Rational r) {
        int temp = r.numerator;
        r.numerator = r.denominator;
        r.denominator = temp;
    }

    private static double toDouble(Rational r) {
        return ((double) r.numerator / (double) r.denominator);
    }

    private static void reduce(Rational r) {
        if (r.numerator == r.denominator) {
            return;
        }
        if (r.numerator > r.denominator) {
        }
        if (r.numerator == 0 || r.denominator == 0) {
            return;
        }
        int one = r.denominator;
        int two = r.numerator;
        int temp = 0;
        while (two != 0) {
            temp = one;
            one = two;
            two = (temp % two);
        }
        r.numerator = (r.numerator / one);
        r.denominator = (r.denominator / one);
        return;
    }

    private static Rational rationalAdd(Rational a, Rational b) {
        int a1 = a.denominator;
        int b1 = b.denominator;
        a.numerator = (a.numerator * b1);
        a.denominator = (a.denominator * b1);
        b.numerator = (b.numerator * a1);
        b.denominator = (b.denominator * a1);
        Rational c = new Rational();
        c.numerator = (a.numerator + b.numerator);
        c.denominator = (a.denominator);
        reduce(c);
        return (c);
    }

    public static void youracusk() {
        System.out.println("Give me rusk!");
    }
}
