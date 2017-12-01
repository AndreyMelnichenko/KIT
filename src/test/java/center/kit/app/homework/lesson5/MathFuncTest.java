package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class MathFuncTest {
    @Test
    public void CbrtTest(){
        double input=8.0; double exp=2.0;
        MyMathFunc myMathFunc = new MyMathFunc();
        double actRes = myMathFunc.CbrtCalc(input);
        Assert.assertEquals(exp,actRes,0.0);
    }
    @Test
    public void  CosTest (){
        double val=-0.0;
        double expRes=1.0;
        MyMathFunc myMathFunc = new MyMathFunc();
        double actRes = myMathFunc.CosCalc(val);
        Assert.assertEquals(expRes,actRes,0.0);
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
        Assert.assertEquals(expRes,actRes,0.0);
    }
    @Test
    public void IeeeTest (){
        double val1=7, val2=3, expRes=1.0;
        MyMathFunc myMathFunc = new MyMathFunc();
        double actRes = myMathFunc.IeeeCalc(val1,val2);
        Assert.assertEquals(expRes,actRes,0.0);
    }
    @Test
    public void IncremTest (){
        long val=1003, expRes=1004;
        MyMathFunc myMathFunc = new MyMathFunc();
        long actRes = myMathFunc.IncremCalc(val);
        Assert.assertEquals(expRes,actRes);
    }
    @Test
    public void MaxTest(){
        int val1=24, val2=55, expRes=55;
        MyMathFunc myMathFunc = new MyMathFunc();
        int actRes=myMathFunc.MaxCalc(val1,val2);
        Assert.assertEquals(expRes,actRes);
    }
    @Test
    public void MultTest(){
        int val1=5, val2=6, expRes=30;
        MyMathFunc myMathFunc = new MyMathFunc();
        int actRes=myMathFunc.MultCalc(val1,val2);
        Assert.assertEquals(expRes,actRes);
    }
    @Test
    public void NegatTest (){
        int val=44, expRes=-44;
        MyMathFunc myMathFunc = new MyMathFunc();
        int actRes = myMathFunc.NegatCalc(val);
        Assert.assertEquals(expRes,actRes);
    }
    @Test
    public void PowTest (){
        double val1=2, val2=2, expRes=4.0;
        MyMathFunc myMathFunc = new MyMathFunc();
        double actRes = myMathFunc.PowCalc(val1,val2);
        Assert.assertEquals(expRes,actRes,0.0);
    }
    @Test
    public void RoundTest(){
        double val=5.5;
        int expRes=6;
        MyMathFunc myMathFunc = new MyMathFunc();
        int actRes=myMathFunc.RoundCalc(val);
        Assert.assertEquals(expRes,actRes);
    }
    @Test
    public void SqrtTest (){
        double val=9, expRes=3;
        MyMathFunc myMathFunc = new MyMathFunc();
        double actRes = myMathFunc.SqrtCalc(val);
        Assert.assertEquals(expRes,actRes,0.0);
    }
    @Test
    public void SubstTest(){
        int val1=33, vla2=11, expRes=22;
        MyMathFunc myMathFunc = new MyMathFunc();
        int actRes=myMathFunc.SubtrCalc(val1,vla2);
        Assert.assertEquals(expRes,actRes);
    }
    @Test
    public void AbsTest(){
        int val=-121, expRes=121;
        MyMathFunc myMathFunc = new MyMathFunc();
        int actRes=myMathFunc.AbsCalc(val);
        Assert.assertEquals(expRes,actRes);
    }
    @Test
    public void CeilTest(){
        double val=22.5, expRes=23;
        MyMathFunc myMathFunc = new MyMathFunc();
        double actRes = myMathFunc.CeilCalc(val);
        Assert.assertEquals(expRes,actRes,0.0);
    }
    @Test
    public void SingTest(){
        double val1=33, val2=-22, expRes=-33;
        MyMathFunc myMathFunc = new MyMathFunc();
        double actRes=myMathFunc.SingCalc(val1,val2);
        Assert.assertEquals(expRes,actRes,0.0);
    }
    @Test
    public void MinTest(){
        double val1=21, val2=41, expRes=21;
        MyMathFunc myMathFunc = new MyMathFunc();
        double actRes=myMathFunc.MinCalc(val1,val2);
    }
}
