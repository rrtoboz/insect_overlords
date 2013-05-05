package com.ricktoboz.omgbugz;

/**
 * Created with IntelliJ IDEA.
 * User: richardtoboz
 * Date: 5/5/13
 * Time: 12:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChapterTwelve {
    public static void main(String[] args) {
        int a = 2;
        a *= 3;
        System.out.println(a);
    }

    public static int[] cloneArray(int[] a) {
        int[] j = new int[a.length];
        for (int b = 0; b < a.length; b++) {
            j[b] = a[b];
        }
        return j;
    }

    public static void printArray(int[] a) {
        for (int j = 0; j < a.length; j++) {
            System.out.print(" " + a[j]);
        }
    }

    public static double randomDouble(double low, double high) {
        if (low == high) {
            return low;
        }
        if (low > high) {
            double bridge = low;
            low = high;
            high = bridge;
        }
        double x = (high - low);
        double y = (low + (StrictMath.random() * x));
        return y;
    }

    public static int randomInt(int low, int high) {
        if (low == high) {
            return low;
        }
        if (low > high) {
            int bridge = low;
            low = high;
            high = bridge;
        }
        int x = (high - low);
        int y = (low + (int) (StrictMath.random() * x));
        return y;
    }

    public static int[] makeHist(int[] scores) {
        int[] counts = new int[100];

        for (int i = 0; i < scores.length; i++) {
            int index = scores[i];
            counts[index]++;
        }
        return counts;
    }

    public static boolean areFactors(int n, int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % n != 0) {
                return false;
            }
        }
        return true;
    }

    public static int findTarget(int target, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }


}