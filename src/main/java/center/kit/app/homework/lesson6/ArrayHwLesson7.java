package center.kit.app.homework.lesson6;

import center.kit.runners.homework.lesson6.Analyzer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class ArrayHwLesson7 {
    public static void exerciseA() {
        int[][] arrayone = new int[21][21];
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k <= 20; k++) {
                if ((k % 2 == 0) && (k != 0) && (i == 0)) {
                    arrayone[i][k] = k;
                    System.out.print(arrayone[i][k] + " ");
                }
                if ((k % 2 == 0) && (k != 0) && (i == 1)) {
                    arrayone[i][k] = k;
                    System.out.print("\n" + arrayone[i][k]);
                }
            }
        }
    }

    public static void exerciseB() {
        int[] myarray = new int[100];
        System.out.print("\n+--------------------------+\n" +
                "| Pair values from 0 to 99 |\n" +
                "+--------------------------+");
        for (int i = 0; i <= 99; i++) {
            myarray[i] = i;
            if ((i % 2 > 0) && (i < 10)) {
                System.out.print(" " + myarray[i] + " ");
            }
            if ((i % 2 > 0) && (i >= 10)) {
                System.out.print(myarray[i] + " ");
            }
            if (i % 10 == 0) {
                System.out.print("\n");
            }
        }
        System.out.println("\n+--------------------------+\n" +
                "|Unpair values from 99 to 0|\n" +
                "+--------------------------+");
        for (int i = 99; i > 0; i--) {
            myarray[i] = i;
            if ((i % 2 > 0) && (i < 10)) {
                System.out.print("" + myarray[i] + "  ");
            }
            if ((i % 2 > 0) && (i >= 10)) {
                System.out.print(myarray[i] + " ");
            }
            if (i % 10 == 0) {
                System.out.print("\n");
            }
        }
    }

    public static void exerciseC() {
        int[] myArray = new int[15];
        int pairCounter = 0;
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(9);
            System.out.print(myArray[i] + " ");
            if (myArray[i] % 2 == 0) {
                pairCounter = pairCounter + 1;
            }
        }
        System.out.println("\nPair values of this array = " + pairCounter);
    }

    public static void exerciseD() {
        int[] myArray = new int[15];
        int max = 0, min = 999;
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(999);
            if (myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("MIN=" + min + " MAX=" + max);
    }

    public static void exerciseE() {
        int[][] myArray = new int[8][5];
        Random random = new Random();
        int min = 10, max = 99;
        for (int i = 0; i < myArray.length; i++) {
            for (int k = 0; k < myArray[i].length; k++) {
                myArray[i][k] = random.nextInt((max - min) + 1) + min;
                System.out.print(myArray[i][k] + " ");
            }
        }
    }

    public static void exerciseF() {
        int[][] myArray = new int[8][5];
        Random random = new Random();
        int min = 1, max = 999;
        for (int i = 0; i < myArray.length; i++) {
            for (int k = 0; k < myArray[i].length; k++) {
                myArray[i][k] = random.nextInt((max - min) + 1) + min;
                if (myArray[i][k] < 10) {
                    System.out.print("  " + myArray[i][k] + " ");
                }
                if ((myArray[i][k] >= 10) && (myArray[i][k] < 100)) {
                    System.out.print(" " + myArray[i][k] + " ");
                }
                if (myArray[i][k] >= 100) {
                    System.out.print(myArray[i][k] + " ");
                }
                if (k == 4) {
                    System.out.print("\n");
                }
            }
        }
    }

    public static void exerciseG() throws Exception {
        int route = 1;
        long mysum = 0;
        while (route != 0) {
            System.out.print("ENTER integer value to SUM or type \"Exit\" to close program\n=>");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputvalue = bufferedReader.readLine();
            route = Analyzer.analyzer(inputvalue);
            if (route == 1) {
                mysum = mysum + Long.parseLong(inputvalue);
            }
            if (route == 2) { //to repeat input value
                System.out.print("Wrong VALUE! Repeat input!\n");
            }
        }
        System.out.println("PROGRAM is OVER.\nSumma= " + mysum);
    }
}
