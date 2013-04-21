package com.ricktoboz.omgbugz;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 1/25/13
 * Time: 11:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class ChapterSix {

    public static void main(String[] args) {
        System.out.println(ack(0, 1));
    }

    public static int ack(int m, int n) {
        if (m == 0) {
            return (n + 1);
        } else if (n == 0) {
            return ack((m - 1), 1);
        } else {
            return ack(m - 1, ack(m, n - 1));
        }

    }


}

