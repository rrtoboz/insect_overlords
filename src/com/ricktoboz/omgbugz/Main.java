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
        int t = pow(x, n / 2);

        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x

        if (n % 2 == 0) {
            return t * t;
        } else {
            return t * t * x;
        }
    }

    public static BigInteger bigpow(int x, int n) {
        if (n == 0) return BigInteger.valueOf(1);

        BigInteger a = BigInteger.valueOf(x);
        BigInteger b = BigInteger.valueOf(n / 2);
        BigInteger c = a;

        // find x to the n/2 recursively
        while (b.intValue() > 1) {
            c = c.multiply(a);
            b = b.subtract(BigInteger.valueOf(1));
        }


        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x

        if (n % 2 == 0) {
            c = c.multiply(c);
            return c;
        } else {
            c = c.multiply(c);
            c = c.multiply(a);
            return c;
        }
    }


}

