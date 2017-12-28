package center.kit.app.classwork.lesson6;

import center.kit.app.homework.lesson5.MyMathFunc;

import java.util.Scanner;

public class Pairs {
    public boolean PairsCalc(int val) {
        int b = 2; boolean a;
        MyMathFunc myMathFunc = new MyMathFunc();
        if (myMathFunc.IeeeCalc(val, b) > 0) {
            a=false;
        }else {a=true;}
        return a;
    }
}

