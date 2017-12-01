package center.kit.app.homework.lesson5;

import static java.lang.Math.cbrt;
import static java.lang.Math.decrementExact;
import static java.lang.Math.floor;
import static java.lang.StrictMath.cos;

public class MyMathFunc {
    public double CbrtCalc(double val){
        return cbrt(val);
    }
    public double CosCalc(double val){
        return cos(val);
    }
    public int DecrementCalc (int val) {
        return decrementExact(val);
    }
    public double FloorCalc (double val){
        return floor(val);
    }
}
