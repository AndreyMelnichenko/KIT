package center.kit.runners.homework.lesson5;

import center.kit.app.homework.lesson5.MyMathFunc;
import java.util.Scanner;

public class MathFuncRun {
    public static void main(String[] args) {
        MyMathFunc myMathFunc = new MyMathFunc();
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        System.out.println("Absolute value of "+(double)val+" = "+ myMathFunc.CbrtCalc(val));
    }

}
