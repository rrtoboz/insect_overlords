package com.ricktoboz.omgbugz;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 1/29/13
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Recurse {
public static String t = "";

    public static void main(String[] args) {
        System.out.println(euclid(36, 20));
    }

    // first: returns the first character of the given String
    public static char first(String s) {
        return s.charAt(0);
    }

    // last: returns a new String that contains all but the
    // first letter of the given String
    public static String rest(String s) {
        return s.substring(1, s.length());
    }

    // length: returns the length of the given String
    public static int length(String s) {
        return s.length();
    }
    public static void printString(String s){
        if (s.length() == 1){System.out.println(first(s));}
            else {System.out.println(first(s)); printString(rest(s));}
    }
    public static void printBackward(String s){
        if (s.length() == 0){}
        else {System.out.println(s.charAt(length(s) - 1));; printBackward(s.substring(0, (length(s) - 1)));

    }}
    public static String reverseString(String s){
        if (s.length() == 0){return s;}
            else return(s.charAt(length(s) - 1) + reverseString(s.substring(0, (length(s) - 1))));}

    public static void reverseAssembler(String s){
    if (s.length() != 0){t = (t + s.charAt(length(s) - 1)); reverseAssembler(s.substring(0, (length(s) - 1)));}
    else return;
    }

    public static double power (double x, int n){
    if (n == 0) {return 1;}
        else {return(x * power(x, (n - 1)));}
    }

    public static int euclid (int x, int y){
        if (x == y) {return x;}
        if (y > x) {return euclid (y, x);}
        if (x == 0) {return 0;}
        if (y == 0) {return x;}
        return euclid(y, ((x % y)));
    }
}

