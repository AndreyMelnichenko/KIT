package center.kit.app.classwork.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class MathFuncTest {
    @Test // JUnit framework annotation
    public void multiplyTest() {
        int a = 1, b = 2, expRes = 2;
        //Assert.assertEquals(expRes, MathFunc.multiply(a, b));
        MathFunc mathFunc = new MathFunc();
        int actRes = mathFunc.multiply(a,b);
        Assert.assertEquals(expRes, actRes);
    }
    @Test
    public void unmultiplyTest(){
        int a=20,b=2, expRes=10;
        MathFunc mathFunc = new MathFunc();
        int actRes = mathFunc.unmultiply(a,b);
        Assert.assertEquals(expRes, actRes);

    }
}
