package com.ricktoboz.omgbugz;
import java.awt.Rectangle;
import java.awt.Point;
import java.math.BigInteger;
public class Main {

    public static void main(String[] args) {
    System.out.println("The pow value is: " + pow(75, 63));
    System.out.println("The bigPow value is: " + bigpow(75, 63));
    }

    public static int pow(int x, int n) {
        if (n == 0) return 1;

        // find x to the n/2 recursively
        int t = pow(x, n/2);

        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x

        if (n%2 == 0) {
            return t*t;
        } else {
            return t*t*x;
        }
    }

    public static BigInteger bigpow(int x, int n) {
        if (n == 0) return BigInteger.valueOf(1);

        BigInteger a = BigInteger.valueOf(x);
        BigInteger b = BigInteger.valueOf(n/2);
        BigInteger c = a;

        // find x to the n/2 recursively
        while (b.intValue() > 1){c = c.multiply(a); b = b.subtract(BigInteger.valueOf(1));}


        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x

        if (n%2 == 0) {
            c = c.multiply(c);
            return c;
        } else {
            c = c.multiply(c);
            c = c.multiply(a);
            return c;
        }
    }

    public static void facTable(int x){
        BigInteger big = BigInteger.valueOf(x);
        System.out.println("Integer    Factorial");
        while (x >= 0){System.out.println(x + "\t" + "\t" + "\t" + factorial(big)); x = (x - 1); big = big.subtract(BigInteger.valueOf(1));}
    }

    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width/2;
        int y = box.y + box.height/2;
        return new Point(x, y);
    }



    public static double squareRoot (double a){
       double b = a;
       double c = (a / 2);
       while (StrictMath.abs(b - c) >= (.0001)) {
           b = c;
           c = ((c + (a / c)) / 2);
        }
       System.out.println(c);
       return c;
    }
    public static double power (double x, int n){
        if (n == 1) {return x;}
        double c = x;
        while (n > 1){
            c = (c * x);
            n = (n - 1);
        }
        return c;
    }
    public static BigInteger factorial (BigInteger x){
        if (x.intValue() == 1) {return BigInteger.valueOf(1);}
        else {BigInteger big = x; while (x.intValue() > 1){x = (x.subtract(BigInteger.valueOf(1))); big = big.multiply(x);}
        return big;
    }
}
    public static double myOldExp (double x, int n){
        double i = 1.0;
        BigInteger thisSucks = factorial(BigInteger.valueOf(n));
            while (n > 0){
                i = (i + (StrictMath.pow(x, n) / thisSucks.intValue()));
                n = (n - 1);}
            return i;
    }
    public static double myExp (double x, int n){
        double r = 1.0;
        double i = 1;
        double t = 1.0;
        double b = 1;
        while (i <= n){
            t = (t * x);
            b = (b * i);
            r = (r + (t / b));
            i = (i + 1);}
        return r;
    }

    public static void check (double x){
        System.out.print(x + "\t");
        System.out.print("\t" + StrictMath.exp(x));
        System.out.println("\t" + myExp(x, 50));
    }

    public static double gauss (double x, int n){
        double r = 1.0;
        double i = 1;
        double t = 1.0;
        double b = 1;
        while (i <= n){
            t = (t * ((x * x) * -1));
            b = (b * i);
            r = (r + (t / b));
            i = (i + 1);}
        return r;
    }
    public static void reverso (String s){
    int i = s.length();
    String r = "";
    while (i > 0) {
        r = r + (s.charAt(i - 1));
        i = i - 1;
    }
        System.out.print(r);
    }
    public static int countLetters (String s, char a){
    int length = s.indexOf(a);
    if (length == -1){return 0;}
        else {int count = 1; length = s.indexOf(a, length + 1);
              while (length != -1) {count = (count + 1); length = s.indexOf(a, length + 1);}
        return count;}
    }
    public static int parenCheck (String check){
    int len = check.length();

    int i = 0;
    int count = 0;

    while (i < len) {
        char c = check.charAt(i);

        if (c == '(') {
            count = count + 1;
        } else if (c == ')') {
            count = count - 1;
        }
        i = i + 1;
    }

    System.out.println(count);
    if (count == 0) {System.out.println("All parenthesis are present.");}
    return count;
    }

    public static String mystery(String s) {
        int i = s.length() - 1;
        String total = "";

        while (i >= 0 ) {
            char ch = s.charAt(i);
            System.out.println(i + "     " + ch);

            total = total + ch;
            i--;
        }
        return total;
    }
    public static void flipper (int number){
    int lastDigit = number%10;
    int firstDigit = number/10;
    System.out.println("" + lastDigit + "" + firstDigit);
}
    public static void enigma(int x) {
        System.out.println(x);
        if (x == 0) {
            return;
        } else {
            enigma(x/2);
        }

        System.out.print(x%2);
    }
    public static char last (String s){
        char last = s.charAt(s.length() - 1);
        return last;
    }
    public static char first (String s){
        return s.charAt(0);
    }
    public static String middle (String s){
        return s.substring((s.length() - (s.length() - 1)), (s.length() - 1));
    }
    public static Boolean isPalindrome (String s){
    if (s.length() == 1){return true;}
    if ((s.length() == 2) && (s.charAt(0) == s.charAt(1))){return true;}
    else if ((s.length() == 2) && (s.charAt(0) != s.charAt(1))){return false;}
        else if ((isPalindrome(s.substring((s.length() - (s.length() - 1)), (s.length() - 1))) == true) &&
                                (first(s.substring((s.length() - (s.length() - 1)), (s.length() - 1))) ==
                                 last(s.substring((s.length() - (s.length() - 1)), (s.length() - 1)))))
        {return true;}
        else {return false;}
    }
    public static Boolean isPalindrome2 (String s){
        if (s == ""){return true;}
        if (s.length() == 1){return true;}
        if ((s.length() == 2) && (s.charAt(0) != s.charAt(1))){return false;}
        else if ((isPalindrome(s.substring((s.length() - (s.length() - 1)), (s.length() - 1))) == true)) {return true;}
        {return false;}
    }
    public static Boolean isPalindromeIter (String s){
        int i = 0;
        while (i <= (s.length() / 2)){
            if (s.charAt(i) != (s.charAt((s.length() - i) - 1))){return false;}
            else {i = (i + 1);}
        }
        return true;
    }
}

