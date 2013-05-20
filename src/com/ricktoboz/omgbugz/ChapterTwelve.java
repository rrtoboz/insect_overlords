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
        int[] a = letterHist("bananas");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
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

    public static int maxInRange(int[] range, int lowIndex, int highIndex) {
        if (range.length == 0) {

            System.out.println("There are no numbers in range.");
            return -2147483648;
        }
        if (range.length == 1) {
            return range[0];
        }
        int candidates = 0;
        for (int i = 0; i < range.length; i++) {
            if (range[i] <= highIndex && range[i] >= lowIndex) {
                candidates++;
            }
        }
        if (candidates == 2) {
            int[] bracket = new int[2];
            int tracker = 0;
            for (int i = 0; i < range.length; i++) {
                if (range[i] <= highIndex && range[i] >= lowIndex) {
                    bracket[tracker] = range[i];
                    tracker++;
                }
            }
            int winnerof2 = 0;
            if (bracket[0] >= bracket[1]) {
                winnerof2 = bracket[0];
            } else {
                winnerof2 = bracket[1];
            }
            return winnerof2;
        }
        if ((candidates % 2) == 0) {
            int[] bracket1 = new int[(candidates / 2)];
            int[] bracket2 = new int[(candidates / 2)];
            int howFarDidWTraverseThroughRange = 0;
            int tracker = 0;
            while (tracker < (candidates / 2)) {
                if (range[howFarDidWTraverseThroughRange] <= highIndex && range[howFarDidWTraverseThroughRange] >= lowIndex) {
                    bracket1[tracker] = range[howFarDidWTraverseThroughRange];
                    tracker++;
                }
                howFarDidWTraverseThroughRange++;
            }

            tracker = 0;
            while (tracker < (candidates / 2)) {
                if (range[howFarDidWTraverseThroughRange] <= highIndex && range[howFarDidWTraverseThroughRange] >= lowIndex) {
                    bracket2[tracker] = range[howFarDidWTraverseThroughRange];
                    tracker++;
                }
                howFarDidWTraverseThroughRange++;
            }
            int a = maxInRange(bracket1, lowIndex, highIndex);
            int b = maxInRange(bracket2, lowIndex, highIndex);
            if (a >= b) {
                return a;
            } else return b;
        } else {
            int[] bracket1 = new int[(candidates / 2)];
            int[] bracket2 = new int[((candidates / 2) + 1)];
            int howFarDidWTraverseThroughRange = 0;
            int tracker = 0;
            while (tracker < (candidates / 2)) {
                if (range[howFarDidWTraverseThroughRange] <= highIndex && range[howFarDidWTraverseThroughRange] >= lowIndex) {
                    bracket1[tracker] = range[howFarDidWTraverseThroughRange];
                    tracker++;
                }
                howFarDidWTraverseThroughRange++;
            }

            tracker = 0;
            while (tracker < ((candidates / 2) + 1)) {
                if (range[howFarDidWTraverseThroughRange] <= highIndex && range[howFarDidWTraverseThroughRange] >= lowIndex) {
                    bracket2[tracker] = range[howFarDidWTraverseThroughRange];
                    tracker++;
                }
                howFarDidWTraverseThroughRange++;
            }
            int a = maxInRange(bracket1, lowIndex, highIndex);
            int b = maxInRange(bracket2, lowIndex, highIndex);
            if (a >= b) {
                return a;
            } else return b;
        }
    }

    public static int max(int[] a) {
        int lowest = a[0];
        int highest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > highest) {
                highest = a[i];
            }
            if (a[i] < lowest) {
                lowest = a[i];
            }
        }
        return maxInRange(a, lowest, highest);
    }

    public static int find(int[] a, int target) {
        if (a.length == 0) {
            return -1;
        }

        if (a.length == 1) {
            if (a[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }

        int currentIndex = 0;
        if (a[0] == target) {
            return 0;
        } else return find(a, target, 1);
    }

    public static int find(int[] a, int target, int currentIndex) {
        if ((currentIndex) == a.length) {
            return -1;
        }

        if (a[currentIndex] == target) {
            return currentIndex;
        } else return find(a, target, (currentIndex + 1));
    }

    public static int indexOfMaxInRange(int[] a, int lowIndex, int highIndex) {
        return find(a, (maxInRange(a, lowIndex, highIndex)));
    }

    public static int[] swapElement(int[] a, int firstIndex, int secondIndex) {
        if (firstIndex >= a.length || secondIndex >= a.length) {
            System.out.println("One or more indexes are outside the array.");
            return a;
        }

        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i == firstIndex) {
                b[i] = a[secondIndex];
            } else if (i == secondIndex) {
                b[i] = a[firstIndex];
            } else {
                b[i] = a[i];
            }
        }

        return b;
    }

    public static int[] selectionSort(int[] a) {
        if (a.length == 0) {
            return a;
        }

        int lowest = a[0];
        int highest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > highest) {
                highest = a[i];
            }
            if (a[i] < lowest) {
                lowest = a[i];
            }
        }

        int[] b = new int[a.length];

        b[0] = a[indexOfMaxInRange(a, lowest, highest)];
        for (int i = 1; i < a.length; i++) {
            b[i] = a[indexOfMaxInRange(a, lowest, (highest - 1))];
            highest = b[i];
        }
        return b;
    }

    public static int getCharacterNumericalValue(String s, int i) {
        char c = s.charAt(i);
        if (s.charAt(i) == 'a') {
            return 0;
        }
        if (s.charAt(i) == 'b') {
            return 1;
        }
        if (s.charAt(i) == 'c') {
            return 2;
        }
        if (s.charAt(i) == 'd') {
            return 3;
        }
        if (s.charAt(i) == 'e') {
            return 4;
        }
        if (s.charAt(i) == 'f') {
            return 5;
        }
        if (s.charAt(i) == 'g') {
            return 6;
        }
        if (s.charAt(i) == 'h') {
            return 7;
        }
        if (s.charAt(i) == 'i') {
            return 8;
        }
        if (s.charAt(i) == 'j') {
            return 9;
        }
        if (s.charAt(i) == 'k') {
            return 10;
        }
        if (s.charAt(i) == 'l') {
            return 11;
        }
        if (s.charAt(i) == 'm') {
            return 12;
        }
        if (s.charAt(i) == 'n') {
            return 13;
        }
        if (s.charAt(i) == 'o') {
            return 14;
        }
        if (s.charAt(i) == 'p') {
            return 15;
        }
        if (s.charAt(i) == 'q') {
            return 16;
        }
        if (s.charAt(i) == 'r') {
            return 17;
        }
        if (s.charAt(i) == 's') {
            return 18;
        }
        if (s.charAt(i) == 't') {
            return 19;
        }
        if (s.charAt(i) == 'u') {
            return 20;
        }
        if (s.charAt(i) == 'v') {
            return 21;
        }
        if (s.charAt(i) == 'w') {
            return 22;
        }
        if (s.charAt(i) == 'x') {
            return 23;
        }
        if (s.charAt(i) == 'y') {
            return 24;
        }
        if (s.charAt(i) == 'z') {
            return 25;
        } else return -1;
    }

    public static int[] letterHist(String s) {
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[getCharacterNumericalValue(s, i)]++;
        }
        return a;
    }

}






    /*/    if (a.length == 1){
            if (a[0] == target){
                return 0;}
            else {
                return -1;}
        }
        int[] bracket1 = new int[(a.length / 2)];
        if (a.length % 2 == 0)
            {int[] bracket2 = new int[(a.length / 2)];}
        else
            {int[] bracket2 = new int[(a.length / 2) + 1];}

    }
}/*/


