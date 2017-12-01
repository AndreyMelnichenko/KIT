package center.kit.app.homework.lesson5;

import static java.lang.Math.*;
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
    public double IeeeCalc (double val1, double val2) { return IEEEremainder(val1,val2);}
    public long IncremCalc (long val){ return incrementExact(val);}
    public int MaxCalc (int val1,int val2){ return max(val1,val2);}
    public int MultCalc (int val1, int val2){ return multiplyExact(val1,val2);}
    public int NegatCalc (int val){ return negateExact(val);}
    public double PowCalc (double val1, double val2){ return pow(val1,val2);}
    public int RoundCalc (double val){ return (int) round(val);}
    public double SqrtCalc (double val){ return sqrt(val);}
    public int SubtrCalc (int val1, int val2){ return subtractExact(val1,val2);}
    public int AbsCalc (int val){ return abs(val);}
    public double CeilCalc (double val){return ceil(val);}
    public double SingCalc (double val1, double val2){return copySign(val1,val2);}
    public double MinCalc (double val1, double val2){return min(val1,val2);}
}
