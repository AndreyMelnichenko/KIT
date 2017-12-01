package center.kit.runners.homework.lesson5;

import center.kit.app.homework.lesson5.MyMathFunc;

import static java.lang.Math.acos;

public class IeeeeRun {
    public static void main(String[] args) {
        MyMathFunc myMathFunc = new MyMathFunc();
        double a=5, b=2.0;
        System.out.println(a+"/"+b+" Ostatok = "+myMathFunc.IeeeCalc(a,b));
        //System.out.println(acos(b));
    }
}
