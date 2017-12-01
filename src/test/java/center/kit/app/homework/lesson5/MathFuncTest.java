package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class MathFuncTest {
    @Test
    public void CbrtTest(){
        double input=8.0; double exp=2.0;
        MyMathFunc myMathFunc = new MyMathFunc();
        double actRes = myMathFunc.CbrtCalc(input);
        Assert.assertEquals(exp,actRes,2.0);
    }
    @Test
    public void  CosTest (){
        double val=180.0;
        double expRes=-1.0;
        MyMathFunc myMathFunc = new MyMathFunc();
        double actRes = myMathFunc.CosCalc(val);
        Assert.assertEquals(expRes,actRes,2.0);
    }
    @Test
    public void DecremTest(){
        int val=199, expRes=198;
        MyMathFunc myMathFunc = new MyMathFunc();
        int actRes = myMathFunc.DecrementCalc(val);
        Assert.assertEquals(expRes,actRes);
    }
    @Test
    public void FloorTest (){
        double val=100.0, expRes=100.0;
        MyMathFunc myMathFunc = new MyMathFunc();
        double actRes = myMathFunc.FloorCalc(val);
        Assert.assertEquals(expRes,actRes,2.0);
    }
}
