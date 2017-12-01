package center.kit.runners.homework.lesson5;

import center.kit.app.homework.lesson5.MyMathFunc;

public class IeeeeRun {
    public static void main(String[] args) {
        MyMathFunc myMathFunc = new MyMathFunc();
        double a=5, b=2;
        System.out.println(a+"/"+b+" Ostatok = "+myMathFunc.IeeeCalc(a,b));
    }
}
