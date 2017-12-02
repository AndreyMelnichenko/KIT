package center.kit.runners.classwork.lesson5;

import center.kit.app.classwork.lesson5.MathFunc;

import java.util.Scanner;

public class MathFuncRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter VAL1: ");
        int val1=scanner.nextInt();
        System.out.print("Enter VAL2: ");
        int val2=scanner.nextInt();
        MathFunc.calculateBigger(val1,val2);
    }
}
