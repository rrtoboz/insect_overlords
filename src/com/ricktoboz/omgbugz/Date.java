package com.ricktoboz.omgbugz;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 5/1/13
 * Time: 7:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Date {
    int year, month, day;

    public Date() {
    }

    public Date(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public static void main(String[] arg) {
        Date birthday = new Date();
        birthday.year = 1984;
        birthday.month = 10;
        birthday.day = 2;
    }
}
