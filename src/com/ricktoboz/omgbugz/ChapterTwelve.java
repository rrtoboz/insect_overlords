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
        int[] test = new int[10];
        test[0] = 347;
        test[1] = 2;
        test[2] = 1001;
        test[3] = 488;
        test[4] = 99;
        test[5] = 13;
        test[6] = 656;
        test[7] = 991;
        test[8] = 34;
        test[9] = 111;
        System.out.println("The max value is: " + maxInRange(test, 1, 300));
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

        /*/int numberOfCandidates = 0;
        int candidateSlot = 0;
        for (int i = 0; i < range.length; i++){
            if (range[i] <= highIndex && range[i] >= lowIndex){numberOfCandidates++;}}
        int[] candidates = new int[numberOfCandidates];
        for (int i = 0; i < range.length; i++){
            if (range[i] <= highIndex && range[i] >= lowIndex){candidates[candidateSlot] = range[i]; candidateSlot++;}}

        if (candidates.length == 0){System.out.println("There are no numbers in range."); return 0;}
        if (candidates.length == 1){return candidates[0];}
        if (candidates.length == 2){
            if (candidates[0] >= candidates[1]){return candidates[0];}
            else return candidates[1];}
        else {
            int[] x = new int[(candidates.length/2)];
            int[] y = new int[(candidates.length/2)];
            for (int i = 0; i < x.length; i++){
                x[i] = candidates[i];}
            for (int i = 0; i < y.length; i++){
                y[i] = candidates[i + (x.length - 1)];}
            return maxInRange(x, )

            int[] x = new int[(range.length - 2)];
        for (int i = 0; (i + 2) < range.length; i++){
            x[(i)] = range[(i + 2)];}

        return maxInRange(x, lowIndex, highIndex);}
}
        }
    }


        if (range.length == 1){
            if (range[0] >= lowIndex && range[0] <= highIndex){return range[0];}
            else return 0;}

        else if (range.length == 2){
            if (range[0] >= lowIndex && range[0] <= highIndex){
                if (range[1] >= lowIndex && range[1] <= highIndex){
                    if (range[0] >= range[1]){return range[0];}
                    else return range[1];}
                else return range[0];}
            else return 0;}

        else {
            int[] x = new int[(range.length - 2)];
            for (int i = 0; (i + 2) < range.length; i++){
                x[(i)] = range[(i + 2)];}

            return maxInRange(x, lowIndex, highIndex);}
    }
/*/
}

