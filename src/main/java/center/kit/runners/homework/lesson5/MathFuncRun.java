package center.kit.runners.homework.lesson5;

import center.kit.app.homework.lesson5.MyCbrt;
import java.util.Scanner;

public class MathFuncRun {
    public static void main(String[] args) {
        MyCbrt myCbrt = new MyCbrt();
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        System.out.println("Absolute value of "+(double)val+" = "+myCbrt.calc(val));
    }
}
