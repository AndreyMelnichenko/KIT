package center.kit.app.homework.lesson6menu;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class DataAnalyzerTest {
    @Test
    @FileParameters(value = "src/test/resources/hw.csv",
            mapper = CsvWithHeaderMapper.class)
    public void dataTest(String argA, int expRes){
        int actRes=Analyzer.analyzer(argA);
        Assert.assertEquals(actRes,expRes);
    }

}
