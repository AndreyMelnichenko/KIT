package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class MathFuncTest {
    @Test
    public void CbrtTest(){
        double input=8.0; double exp=2.0;
        MyCbrt myCbrt = new MyCbrt();
        double actRes = myCbrt.calc(input);
        Assert.assertEquals(exp,actRes,2.0);
    }

}
