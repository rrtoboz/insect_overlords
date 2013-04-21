package com.ricktoboz.omgbugz;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 1/29/13
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Recurse {

    public static void main(String[] args) {
        System.out.println(euclid(36, 20));
    }

    public static int euclid(int x, int y) {
        if (x == y) {
            return x;
        }
        if (y > x) {
            return euclid(y, x);
        }
        if (x == 0) {
            return 0;
        }
        if (y == 0) {
            return x;
        }
        return euclid(y, ((x % y)));
    }
}

